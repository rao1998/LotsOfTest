package test;

import com.alibaba.fastjson.JSON;
import domain.ApiResult;
import domain.ROrderPageDTO;
import domain.VReturnSkuNum;
import org.apache.commons.collections4.MapUtils;
import org.apache.poi.ss.formula.functions.T;
import org.junit.Test;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Tests {
    @Test
    public void test01() {
        ROrderPageDTO order = new ROrderPageDTO();
        order.setId(2917);
        Map<Integer, VReturnSkuNum> skuNumMap = new HashMap<>();
        VReturnSkuNum vReturnSkuNum = new VReturnSkuNum();
        vReturnSkuNum.setTotalSkuUnits(null);
        vReturnSkuNum.setRoId(2917);
        skuNumMap.put(2917, vReturnSkuNum);
        Integer orderId = order.getId();
        boolean isNull = MapUtils.isEmpty(skuNumMap) || skuNumMap.get(orderId) == null;
        VReturnSkuNum vReturnSkuNum1 = skuNumMap.get(orderId);
        Integer totalSkuUnits = isNull || vReturnSkuNum1.getTotalSkuUnits() == null ? 0 : vReturnSkuNum1.getTotalSkuUnits();
        order.setTotalSkuUnits(skuNumMap.get(orderId).getTotalSkuUnits());
        order.setTotalSkuUnits(totalSkuUnits);
    }

    @Test
    public void test02() {
        ApiResult<String> success = ApiResult.SUCCESS("raoxing5");
        System.out.println(JSON.toJSONString(success));
    }

    @Test
    public void test03() throws ParseException {

        Map<String, Integer> result = new HashMap<>();
        Calendar cal = Calendar.getInstance();

        //设置一周的开始,默认是周日,这里设置成星期一
        cal.setFirstDayOfWeek(Calendar.MONDAY);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat formatMon = new SimpleDateFormat("MM");
        SimpleDateFormat formatYear = new SimpleDateFormat("yyyy");
        Date d = format.parse("2020-12-27");
        cal.setTime(d);
        int month = Integer.parseInt(formatMon.format(d));
        int year = Integer.parseInt(formatYear.format(d));

        int week = cal.get(Calendar.WEEK_OF_YEAR);
        //result.put("week", week);
        if (week == 1 && month == 12) {
            result.put("year", year + 1);
        } else {

            result.put("year", year);
        }
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void test04() throws ParseException {

        Calendar cal = Calendar.getInstance();

        //设置一周的开始,默认是周日,这里设置成星期一
        cal.setFirstDayOfWeek(Calendar.MONDAY);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date d = format.parse("2020-12-30");
        cal.setTime(d);
        int week = cal.get(Calendar.WEEK_OF_YEAR);

        System.out.println(week);
    }

    /**
     * 获取当前年份第一个周一是几号
     */
    @Test
    public void test05() throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        cal.setTime(format.parse("2018-01-01"));
        while (true) {
            if (getFirstMonday(cal.getTime())==1){
                break;
            }
            //如果不是周一，那就把时间加一天
            cal.set(Calendar.DAY_OF_MONTH, cal.get(Calendar.DAY_OF_MONTH) + 1);
        }
        System.out.println(format.format(cal.getTime()));
        //System.out.println(getFirstMonday(new SimpleDateFormat("yyyy-MM-dd").parse("2021-01-03")));
    }

    int getFirstMonday(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        //cal认为周日是星期一，所以把传进来的时间减1天
        cal.set(Calendar.DAY_OF_MONTH, cal.get(Calendar.DAY_OF_MONTH) - 1);
        return cal.get(Calendar.DAY_OF_WEEK);
    }


}

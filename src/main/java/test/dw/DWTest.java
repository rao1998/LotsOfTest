package test.dw;

import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import domain.CalendarDTO;
import domain.User;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author: raoxing5
 * @date: 2023/06/29
 */
public class DWTest {

    CloseableHttpClient client = HttpClients.createDefault();

    @Test
    public void test01() {
        List<String> filterDate = new ArrayList<>();
        try {
            String accessToken = "";
            Map<String, Object> map = new HashMap<>();
            map.put("app_id", "ee_hd4gcVgr1QVdeaHn");
            map.put("app_secret", "HnGOFHIoP6bKjo7PWTzxN5LOqyNzprsX");
            String tokenResponse = HttpUtil.post("http://t1-ee-opendata-api.shizhuang-inc.net/api/access_token", JSON.toJSONString(map));
            JSONObject tokenObject = JSONObject.parseObject(tokenResponse);
            if (tokenObject != null && (Integer) tokenObject.get("code") == 0 && tokenObject.get("data") != null) {
                accessToken = (String) JSONObject.parseObject(tokenObject.get("data").toString()).get("access_token");
            }
            if (StringUtils.isNotBlank(accessToken)) {
                URIBuilder builder = new URIBuilder("http://t1-ee-opendata-api.shizhuang-inc.net/api/system/calendar");
                builder.addParameter("start_time", "2023-01-19T00:00:00+08:00");
                builder.addParameter("end_time", "2023-01-28T00:00:00+08:00");
                HttpGet request = new HttpGet(builder.build());
                request.setHeader("accessToken", accessToken);
                CloseableHttpResponse response = client.execute(request);
                //0-节假日 1-工作日 2-小休日 3-休息日
                if (response != null) {
                    JSONObject jsonObject = JSON.parseObject(EntityUtils.toString(response.getEntity()));
                    if (jsonObject != null && jsonObject.get("code") != null && (Integer) jsonObject.get("code") == 0 && jsonObject.get("data") != null) {
                        List<CalendarDTO> calendarList = JSON.parseObject(
                                JSONObject.parseObject(jsonObject.get("data").toString()).get("list").toString(),
                                new TypeReference<List<CalendarDTO>>() {
                                });
                        filterDate = calendarList.stream().filter(data -> data.getDateType() == 0).map(CalendarDTO::getDate).collect(Collectors.toList());
                    }
                }
            }
        } catch (Exception e) {
            System.out.println();
        }
        System.out.println(JSON.toJSONString(filterDate));
    }

    @Test
    public void test02() {
        int count = -1;
        while (true){
            count++;
            User user = null;
            if (count%2==0){
                user = new User("","");
            }
            if (user==null){
                continue;
            }
            System.out.println(user.getUsername());
        }
    }

    @Test
    public void test03() {
        List<String> list = new ArrayList<>();
        list.add("111");
        list.add("222");
        list.add("333");
        List<String> collect = list.stream().skip(1).collect(Collectors.toList());
        System.out.println(JSON.toJSONString(collect));
    }

    @Test
    public void test04() {
        System.out.println(JSON.toJSONString(null));
    }
    @Test
    public void test05() {
        System.out.println(new Random().nextInt(2));
        System.out.println(new Random().nextInt(2));
        System.out.println(new Random().nextInt(2));
        System.out.println(new Random().nextInt(2));
        System.out.println(new Random().nextInt(2));
        System.out.println(new Random().nextInt(2));
        System.out.println(new Random().nextInt(2));
        System.out.println(new Random().nextInt(2));
        System.out.println(new Random().nextInt(2));
        System.out.println(new Random().nextInt(2));
        System.out.println(new Random().nextInt(2));
        System.out.println(new Random().nextInt(2));
        System.out.println(new Random().nextInt(2));
        System.out.println(new Random().nextInt(2));
        System.out.println(new Random().nextInt(2));
        System.out.println(new Random().nextInt(2));
        System.out.println(new Random().nextInt(2));
        System.out.println(new Random().nextInt(2));
        System.out.println(new Random().nextInt(2));
    }
}

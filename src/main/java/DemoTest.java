import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import domain.*;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class DemoTest {
    @Test
    public void test01() {
        String s = "";
        String[] split = s.split(",");
        for (String s1 : split) {
            System.out.println(s1);
        }
    }

    @Test
    public void test02() {
        String url = "https://.jd.com";
        boolean b = url.split("\\?")[0].split("/")[2].endsWith(".jd.com");
        if (b) {
            System.out.println("是的");
        } else {
            System.out.println("不是");
        }

    }

    @Test
    public void test03() {
        String url = "123";
        String[] split = url.split("\\?");
        System.out.println(split.length);
    }

    @Test
    public void test04() {
//        String url = "www.baidu.com/system?a=1?&b=2&?c=3";
        String url = "www.baidu.com/system?";
        System.out.println(url.length());
        int firstIndex = url.indexOf('?');
        if ((firstIndex + 1) == url.length()) {
            System.out.println("没参数了");
        }
    }

    @Test
    public void test05() {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add(null);
        strings.add("1");
        System.out.println(strings.size());
        if (strings.get(0) == null) {
            System.out.println("null存进去了");
        }

    }

    @Test
    public void test06() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("123");
        System.out.println(list.get(1));
    }

    @Test
    public void test07() {
        String sss = "     ";
        String trim = sss.trim();
        System.out.println(trim.length());
    }

    @Test
    public void test08() {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("username", "rao");
        hashMap.put("password", "raoxing123");
        String paramMap = JSONObject.toJSONString(hashMap);

        JSONObject jsonObject = JSONObject.parseObject(paramMap);
        HashMap<String, String> map = (HashMap<String, String>) jsonObject.toJavaObject(Map.class);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "===" + entry.getValue());
        }


    }

    @Test
    public void test09() {
        List<String> executors = new ArrayList<String>();
        executors.add("123");
        executors.add("345");
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("executors", JSON.toJSONString(executors));
        String executors1 = map.get("executors");
        List<String> executorList = (List<String>) JSON.parse(executors1);
        for (String s : executorList) {
            System.out.println(s);
        }


    }

    @Test
    public void test10() {
        List<String> parse = (List<String>) JSON.parse("");
        System.out.println(JSON.toJSONString(parse));
    }

    @Test
    public void test11() {
        ArrayList<Long> list1 = new ArrayList<Long>();
        ArrayList<Long> list2 = new ArrayList<Long>();
//        list1.add(1L);
//        list1.add(3L);
//        list1.add(5L);
        list2.add(1L);
        list1.removeAll(list2);
        for (Long aLong : list1) {
            System.out.println(aLong);
        }
    }

    @Test
    public void test12() {
        String s = String.valueOf(null);
        System.out.println(s);
    }

    @Test
    public void test13() {
        BigDecimal bigDecimal = new BigDecimal(0);
        System.out.println(bigDecimal);
    }

    @Test
    public void test15() {
        BigDecimal s = new BigDecimal("-1");

        ArrayList<String> list = new ArrayList<String>();
        list.add(s == null ? "" : String.valueOf(s.compareTo(new BigDecimal("-1")) == 0 ? "" : s));
        System.out.println(list.get(0));
    }

    @Test
    public void test16() {
        BigDecimal a = new BigDecimal("-1");
        BigDecimal bigDecimal = new BigDecimal(-1);
        System.out.println(a);
        System.out.println(bigDecimal);
    }

    @Test
    public void test17() {
        BigDecimal decimal = new BigDecimal("");
        System.out.println(decimal);
    }

    @Test
    public void test18() {
        String s = String.valueOf(null);
        System.out.println(s);
    }

    @Test
    public void test19() {
        String s = "abc";
        long l = Long.parseLong(s);
        System.out.println(l);
    }

    @Test
    public void test20() {
        String s = "11";
        int i = Integer.parseInt(s);
        long l = Long.parseLong(s);
        System.out.println(i);
        System.out.println(l);
    }

    @Test
    public void test21() {
        User rao = new User("rao", "123");
        User wen = new User("wen", "456");
        List<User> userList = new ArrayList<User>();
        userList.add(rao);
        userList.add(wen);

        for (User user : userList) {
            user.setPassword("111111111");
        }
        for (User user : userList) {
            System.out.println(user);
        }

    }

    @Test
    public void test22() {
        User rao = new User("rao", "123");
        User wen = rao;
        wen.setPassword("222222222");
        System.out.println(rao);
    }

    @Test
    public void test23() {
        HashSet<String> set = new HashSet<String>();
        set.add("1");
        set.add("2");
        set.add("3");
        String[] array = set.toArray(new String[set.size()]);
        for (String s : array) {
            System.out.println(s);
        }
    }

    @Test
    public void test24() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("", "1");
        for (Map.Entry<String, String> stringStringEntry : map.entrySet()) {
            System.out.println(stringStringEntry.getKey());
        }
    }

    /*@Test
    public void test25(){
        User user = new User("a", "123");
        User user2 = new User("b", "123");
        User user3 = new User("a", "123");

        ArrayList<User> users = new ArrayList<User>();
        users.add(user);
        users.add(user2);
        users.add(user3);

        ArrayList<User> users1 = new ArrayList<>();
        for (User user1 : users) {
                boolean b = users1.stream().anyMatch(u -> u.getUsername().equals(user1.getUsername()));
                if (!b){
                    users1.add(user1);
                }
        }

        for (User user1 : users1) {
            System.out.println(user1);
        }
    }*/

    @Test
    public void test26() {
        ArrayList<Long> longs = new ArrayList<Long>();
        longs.add(null);
        longs.add(null);
        longs.add(null);
        for (Long aLong : longs) {
            System.out.println(aLong);
        }
    }

    @Test
    public void test27() {
        String s = "123";
        char c = s.charAt(1);
        System.out.println(c);
        System.out.println(s);
    }

    @Test
    public void test28() {
        StaticClassRao staticClassRao = new StaticClassRao();
        System.out.println(staticClassRao);
        StaticClassRao.show();
    }

    @Test
    public void test29() {
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date()));
    }

    @Test
    public void test30() {
        String s = null;
        String trim = s.trim();
    }

    @Test
    public void test31() {
        BigDecimal decimal = new BigDecimal(" ");
        System.out.println(decimal);
    }

    @Test
    public void test32() {
        Integer a = 1;
        int b = 1;
        System.out.println(a == b);
    }

    @Test
    public void test33() {
        String s = null + "lllllll";
        System.out.println(s);
    }

    @Test
    public void test34() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = simpleDateFormat.parse("2020-02-03");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
//        System.out.println(calendar.get(Calendar.YEAR)*100 + calendar.get(Calendar.MONTH));
        System.out.println(simpleDateFormat.format(calendar.getTime()));
        System.out.println(calendar.get(Calendar.MONTH));
    }

    @Test
    public void test35() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = simpleDateFormat.parse("2020-01-03");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        calendar.add(Calendar.MONTH, 1);
        System.out.println(simpleDateFormat.format(calendar.getTime()));
    }

    @Test
    public void test36() throws ParseException {
        String date1 = "2020-03-04";
        String date2 = "2020-03-02";
        System.out.println(date2.compareTo(date1));
    }

    /*@Test
    public void test37() throws ParseException {
        User user = new User("1234","2134");
        ArrayList<User> users = new ArrayList<>();
        users.add(user);
        users.add(user);
        users.add(user);
        users.remove(user);
        System.out.println(users.size());
    }*/
    @Test
    public void test38() throws ParseException {
        int a = 10;
        int b = 9;
        System.out.println(Math.ceil(a * 1.0 / b));
    }

    @Test
    public void test39() {
        int a = 128;
        Integer b = 128;
        Integer c = 128;
//        System.out.println(a==b);
//        System.out.println(b.equals(a));
        System.out.println(b == c);
//        System.out.println(b.equals(c));
    }

    @Test
    public void test40() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("username11", "1234");
        jsonObject.put("password11", "aaaa");
        User user = jsonObject.toJavaObject(User.class);
        System.out.println(user);
    }

    @Test
    public void test41() {
        List<Integer> orders = Arrays.asList(1);
        StringBuilder sb = new StringBuilder();
        for (Integer order : orders) {
            sb.append(",").append(order);
        }
        String orderIdList = sb.substring(1);
        System.out.println(orderIdList);
    }

    @Test
    public void test41Middle() {
        System.out.println(null instanceof String);
    }

    @Test
    public void test42() {
        User user1 = new User("1", "2134");
        ArrayList<User> users = new ArrayList<>();
        users.add(user1);
        System.out.println(JSON.toJSONString(users));
    }

    @Test
    public void test43() throws IOException {
        FileOutputStream fos = new FileOutputStream("E:\\temp.txt");
        fos.write("你好啊啊啊啊啊啊".getBytes());
        fos.close();
    }

    @Test
    public void test44() {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("E:\\1234.txt");
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {

            }
        }

    }

    @Test
    public void test45() {
        ArrayList<Object> objects = new ArrayList<>();
        objects = null;
        if (objects != null) {
            objects.forEach(o -> System.out.println("1234"));
        }
    }

    @Test
    public void test46() {
        HashMap<String, Object> item = new HashMap<>(16);
        item.put("state", "已删除");
        item.put("deleteType", 3);
        String inputId = "state,deleteType";
        String[] split = inputId.split(",");
        String state = (String) item.get(split[0]);
        Integer deleteType = (Integer) item.get(split[1]);


        if (!"已删除".equals(state)) {
            item.put("deleteTypeStr", "");
        }
    }

    @Test
    public void test47() throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        System.out.println(list.toString());
    }

    @Test
    public void test48() throws IOException {
        System.out.println(JSON.toJSONString(null));
    }

    @Test
    public void test49() throws IOException, NoSuchFieldException {
        Man man = new Man("1234", new Secret());
        Field field = man.getClass().getDeclaredField("name");
        Class<?> type = field.getType();
        System.out.println(type);

    }

    @Test
    public void test50() throws IOException {
        BigDecimal value = BigDecimal.ZERO;
        BigDecimal scale = value.setScale(3, BigDecimal.ROUND_DOWN);
        System.out.println(scale);
    }

    @Test
    public void test51() throws IOException {

        ArrayList<BigDecimal> bigDecimals = new ArrayList<>();
        bigDecimals.add(new BigDecimal("1.111"));
        bigDecimals.add(new BigDecimal("2.22"));
        BigDecimal sum = new BigDecimal("0.000");
        for (BigDecimal bigDecimal : bigDecimals) {
            sum.add(bigDecimal);
        }
        System.out.println(sum);
    }

    @Test
    public void test52() throws IOException, ParseException {
        /*SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date date = format.parse("2020-07-23");

        System.out.println(format1.format(date));*/
        Date date = new Date();

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        //System.out.println(format1.format(calendar.getTime()));
        System.out.println(calendar.getTime());

        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);

        //System.out.println(format1.format(calendar.getTime()));
        System.out.println(calendar.getTime());
    }

    @Test
    public void test53() throws IOException, ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        //Date date = format.parse("2020-07-23 00:00:00");
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        System.out.println(calendar.getTime());
        System.out.println(format.format(calendar.getTime()));
        System.out.println("=======================");

        calendar.set(Calendar.HOUR, 14);   //0点和中午都是0不是  11是，12是0,23是0
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);

        System.out.println(calendar.getTime());
        System.out.println(format.format(calendar.getTime()));
    }


    @Test
    public void test54() throws IOException, ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        Date date = format.parse("2020-07-23 21:00:00");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));

    }

    @Test
    public void test55() throws IOException {
        Date date = new Date();
        String dateStr = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(date);
        System.out.println(dateStr);
    }

    @Test
    public void test56() throws IOException {
        Date date = new Date();
        System.out.println(date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        calendar.set(Calendar.HOUR, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);

        System.out.println(calendar.getTime());
    }

    @Test
    public void test57() throws Exception {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date date = format.parse("2020-07-23 23:59:59");
        System.out.println(date);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        calendar.set(Calendar.HOUR, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);

        System.out.println(calendar.getTime());
    }

    @Test
    public void test58() throws IOException, ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        Date date = format.parse("2020-07-23");
        System.out.println(date);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);

        System.out.println(calendar.getTime());
    }

    @Test
    public void test59() throws IOException, ParseException {
        System.out.println(1 >> 2);
    }


    public Date getSpecialTimeOfDate(Date date, boolean isBegin) {
        Calendar cal = Calendar.getInstance();
        if (date == null) {
            return null;
        }
        cal.setTime(date);
        if (isBegin) {
            cal.set(Calendar.HOUR_OF_DAY, 0);
            cal.set(Calendar.MINUTE, 0);
            cal.set(Calendar.SECOND, 0);
        } else {
            cal.set(Calendar.HOUR_OF_DAY, 23);
            cal.set(Calendar.MINUTE, 59);
            cal.set(Calendar.SECOND, 59);
        }
        return cal.getTime();
    }

    @Test
    public void test60() throws IOException, ParseException {
        HashMap<String, String> map = null;
        boolean flag = judgeMapEmpty(map);
    }

    private boolean judgeMapEmpty(Map map) {

        if (map == null || map.size() == 0) {
            return true;
        }
        return false;
    }

    @Test
    public void test61() throws IOException, ParseException {
        Map<Integer, List<String>> map = new HashMap<>();
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("1","30");
        hashMap.put("2","40");
        hashMap.put("3","50");
        hashMap.put("4","30");
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            int overdueDate = Integer.parseInt(value);
            List<String> deptList = map.computeIfAbsent(overdueDate, k -> new ArrayList<>());
            deptList.add(key);
        }
        for (Map.Entry<Integer, List<String>> entry : map.entrySet()) {
            System.out.println(entry.getKey()+"="+entry.getValue());
        }

    }

    @Test
    public void calculateHashCode() {
        String s = "1";
        System.out.println(s.hashCode());
    }

    @Test
    public void calculate11111() {
        Integer a = 129;
        int b = 129;
        System.out.println(a==b);

    }
    @Test
    public void calculate1111221() {
        System.out.println(StringUtils.isNotEmpty(""));
    }

    @Test
    public void testObject() {
        User user = getUser();
        System.out.println(user.sex);
    }

    public User getUser(){
        return null;
    }

    @Test
    public void test62() {
        ArrayList<String> list = new ArrayList<>();
        list.add("rao");
        list.add("wen");
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("rao");
        System.out.println(list.toString());
        System.out.println(JSONObject.toJSONString(list));
        System.out.println("==="+list.retainAll(list1));
    }

    @Test
    public void test63(){
        ArrayList<Secret> secrets = new ArrayList<>();
        secrets.add(new Secret("1234","aaaa"));
        secrets.add(new Secret("2222","bbbb"));
        secrets.add(new Secret("3333","cccc"));
        List<LabelValue> collect = secrets.stream().map(m -> {
            return new LabelValue(m.getHeight(), m.getWeight());
        }).collect(Collectors.toList());
        System.out.println(collect.toString());
    }
}

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

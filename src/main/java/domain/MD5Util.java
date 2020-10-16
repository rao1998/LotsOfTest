package domain;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.security.MessageDigest;

public class MD5Util {
    public MD5Util() {
    }

    private static final String MD5(String s) {
        char[] hexDigits = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

        try {
            byte[] btInput = s.getBytes();
            MessageDigest mdInst = MessageDigest.getInstance("MD5");
            mdInst.update(btInput);
            byte[] md = mdInst.digest();
            int j = md.length;
            char[] str = new char[j * 2];
            int k = 0;

            for(int i = 0; i < j; ++i) {
                byte byte0 = md[i];
                str[k++] = hexDigits[byte0 >>> 4 & 15];
                str[k++] = hexDigits[byte0 & 15];
            }

            return new String(str);
        } catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    public static String getSign(String appCode, String businessId, String requestTimestamp, String safetyKey, String params) {
        return MD5(appCode + businessId + requestTimestamp + safetyKey + params);
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
//        getSign("yodamms",
//                "3703GA862Q6DZ79FVEOL",
//                "2020-01-07 14:24:13.681","3703GA862Q6DZ79FVEOL","lixianyue");

        String s ="%7B%22appCode%22%3A%22yodamms%22%2C%22resStatus%22%3A%22501%22%2C%22resMsg%22%3A%22%E5%AE%89%E5%85%A8%E8%AE%A4%E8%AF%81%E5%A4%B1%E8%B4%A5%22%2C%22resCount%22%3A1%2C%22responsebody%22%3Anull%7D" ;
        String jsonDecodeResult = URLDecoder.decode(s, "utf-8");
        System.out.println(jsonDecodeResult);

    }
}
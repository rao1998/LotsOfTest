package coobird;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;
import net.coobird.thumbnailator.Thumbnails;

import java.io.*;

public class TestThumbnails {
    public static void main(String[] args) {
        //压缩速度、格式支持？
        try {
            long start = System.currentTimeMillis();
            FileInputStream fis = new FileInputStream("classpath:图片1.jpg");
//            Thumbnails.of(fis).scale(1f).outputQuality(0.25d).toFile("");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Thumbnails.of(fis).scale(1f).outputQuality(0.25d).toOutputStream(byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            System.out.println("数组长度："+byteArray.length);
            long end = System.currentTimeMillis();
            System.out.println(end-start+"ms");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

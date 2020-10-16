package coobird;

import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Iterator;

import static javax.imageio.ImageWriteParam.MODE_COPY_FROM_METADATA;
import static javax.imageio.ImageWriteParam.MODE_EXPLICIT;

public class TestImageW {
    public static void main(String[] args) throws Exception {
        BufferedImage bufferedImage = ImageIO.read(new FileInputStream("D:\\raoxing5\\Desktop\\图片.jpg"));

        long start = System.currentTimeMillis();

        Iterator iter = ImageIO.getImageWritersByFormatName("jpeg");
        ImageWriter writer = (ImageWriter) iter.next();

        ImageWriteParam imageWriteParam = writer.getDefaultWriteParam();

        imageWriteParam.setCompressionMode(MODE_EXPLICIT);
        imageWriteParam.setProgressiveMode(MODE_COPY_FROM_METADATA);
        imageWriteParam.setCompressionQuality(0.25f);

        IIOImage iIamge = new IIOImage(bufferedImage, null, null);

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        writer.setOutput(ImageIO.createImageOutputStream(byteArrayOutputStream));
        writer.write(null, iIamge, imageWriteParam);

        byte[] bytes = byteArrayOutputStream.toByteArray();

        long end = System.currentTimeMillis();
        System.out.println(end-start+"ms");

        FileOutputStream fos = new FileOutputStream("D:\\raoxing5\\Desktop\\ImageIO压缩图片.jpg");
        fos.write(bytes);
        fos.close();


    }
}

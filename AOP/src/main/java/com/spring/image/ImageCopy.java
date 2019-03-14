package com.spring.image;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;

public class ImageCopy{
     private static final Logger logger = LoggerFactory.getLogger(ImageCopy.class);

    public void copyImage() throws IOException{
        logger.info("从d盘复制到e盘");
        File srcFile = new File("D:/bg.jpg"); //原图片位置
        File destFile = new File("E:/bg1.jpg"); //目的图片位置
        InputStream in = new FileInputStream(srcFile);
        OutputStream out =new FileOutputStream(destFile);
        byte[] bytes = new byte[(int) srcFile.length()];//一段一段的获取原文件字节
        int len;
        //传递字节
        while ((len = in.read(bytes)) != -1){
            out.write(bytes,0,len);
        }
        //关闭io流
        in.close();
        out.close();
    }
}

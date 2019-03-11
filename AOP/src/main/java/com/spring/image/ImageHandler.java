package com.spring.image;

import cn.hutool.core.util.ImageUtil;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

@Aspect
public class ImageHandler {
    private static final Logger logger = LoggerFactory.getLogger(ImageCopy.class);
    private int width;
    private int height;

    @Pointcut("execution(* com.spring.image.ImageCopy.copyImage())")
    public void handleImage(){}

    @Before(value = "handleImage()")
    public void pressTextOnImage(){
        logger.info("开始加水印");
        File srcFile = new File("D:/bg.jpg");
        File destFile = new File("D:/bg1.jpg");
           Image image;
        try {
             image = ImageIO.read(srcFile);
            width =image.getWidth(null);
            height = image.getHeight(null);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Color color = new Color(211,71,38);
        Font font = new Font("微软雅黑",Font.BOLD,40);
        ImageUtil.pressText(srcFile,destFile,"Spring AOP水印",color,font,width/4+font.getSize(),height/2-font.getSize(),1.0f);
    }

    @AfterReturning("handleImage()")
    public void grayImage(){
        logger.info("开始转黑白");
        File srcFile = new File("E:/bg1.jpg");
        File destFile = new File("E:/bg2.jpg");
        ImageUtil.gray(srcFile,destFile);
    }

}

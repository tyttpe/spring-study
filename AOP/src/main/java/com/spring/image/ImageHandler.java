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
import java.io.File;
import java.io.IOException;
//引用aspect依赖
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
             image = ImageIO.read(srcFile);//读取图片
            width =image.getWidth(null);
            height = image.getHeight(null);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Color color = new Color(211,71,38);//水印颜色
        Font font = new Font("微软雅黑",Font.BOLD,40);//水印字体
        //hutool依赖中的方法
        ImageUtil.pressText(srcFile,destFile,"Spring AOP水印",color,font,width/4+font.getSize(),height/2-font.getSize(),1.0f);
    }

    @AfterReturning("handleImage()")
    public void grayImage(){
        logger.info("开始转黑白");
        File srcFile = new File("E:/bg1.jpg");
        File destFile = new File("E:/bg2.jpg");
        //hutool依赖中的方法
        ImageUtil.gray(srcFile,destFile);
    }

}

package com.spring.image;


import cn.hutool.core.io.FileUtil;
import cn.hutool.extra.qrcode.QrCodeUtil;
import cn.hutool.extra.qrcode.QrConfig;

import java.awt.*;

public class Qr {
    public static void main(String[] args) {
        QrConfig qrConfig = new QrConfig(300,300);
        qrConfig.setMargin(3);
        Color foreColor = new Color(210, 180, 140);
        Color bgColor = new Color(216, 191, 216);
        int foreColorRGB = foreColor.getRGB();
        int bgColorRGB = bgColor.getRGB();
        qrConfig.setForeColor(foreColorRGB);
        qrConfig.setBackColor(bgColorRGB);


        QrCodeUtil.generate(
                "https://www.jianshu.com/u/da78949a5e27",
                QrConfig.create().setImg("d:/top.jpg").setBackColor(bgColorRGB).setForeColor(foreColorRGB),
                FileUtil.file("e:/qrcodeWithLogo.jpg")
        );

    }

}

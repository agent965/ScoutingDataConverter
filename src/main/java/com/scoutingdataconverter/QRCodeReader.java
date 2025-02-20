package com.scoutingdataconverter;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import com.google.zxing.*;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
public class QRCodeReader {
    public static String readQrCode(String filePath) throws IOException, NotFoundException {
        File qrFile = new File(filePath);
        BufferedImage bufferedImage = ImageIO.read(qrFile);
        LuminanceSource source = new BufferedImageLuminanceSource(bufferedImage);
        BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));
        Result result = new MultiFormatReader().decode(bitmap);
        return result.getText();
    }

}
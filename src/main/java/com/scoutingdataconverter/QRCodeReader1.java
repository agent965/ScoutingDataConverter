package com.scoutingdataconverter;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
public class QRCodeReader1 {
    public static String readQrCode(String filePath) throws IOException, com.google.zxing.NotFoundException {
        try{
            File qrFile = new File(filePath);
            BufferedImage bufferedImage = ImageIO.read(qrFile);
            LuminanceSource source = new BufferedImageLuminanceSource(bufferedImage);
            BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));
            Result result = new MultiFormatReader().decodeWithState(bitmap);
            return result.getText();
        } catch (com.google.zxing.NotFoundException e){
            System.out.println("Error reading QR code: " + e);
            return null;
        }
    }

}
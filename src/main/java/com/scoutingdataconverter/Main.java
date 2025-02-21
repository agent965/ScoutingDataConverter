package com.scoutingdataconverter;

import java.io.IOException;

import com.google.zxing.NotFoundException;

public class Main {
    public static void main(String[] args) throws IOException, NotFoundException{
        System.out.println(com.google.zxing.NotFoundException.getNotFoundInstance());
        System.out.println("Hello world!");
        String filepath = "QRTest.png";
        try {
            String qrText = QRCodeReader1.readQrCode(filepath);
            System.out.println(qrText);
        } catch (NotFoundException e) {
            System.out.println("Error reading QR code: " + e);
        }
        
        
        
    }
}
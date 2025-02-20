package com.scoutingdataconverter;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String filepath = "QRTest.png";
        try {
            String qrText = QRCodeReader1.readQrCode(filepath);
            System.out.println(qrText);
        } catch (Exception e) {

        }
        
        
        
    }
}
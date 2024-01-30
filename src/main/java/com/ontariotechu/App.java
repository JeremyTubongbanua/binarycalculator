package com.ontariotechu;

public class App {
    public static void main(String[] args) {
        Binary binaryMult1 = new Binary("01010"); // 10
        Binary binaryMult2 = new Binary("00011"); // 3
        Binary binaryMult3 = Binary.multiply(binaryMult1, binaryMult2);
        System.out.println(binaryMult3.getValue()); // 11110 = 30

        Binary binaryAdd1 = new Binary("01010"); // 10
        Binary binaryAdd2 = new Binary("00011"); // 3
        Binary binaryAdd3 = Binary.add(binaryAdd1, binaryAdd2);
        System.out.println(binaryAdd3.getValue()); // 1101 = 13

        Binary binaryAnd1 = new Binary("01010"); // 10
        Binary binaryAnd2 = new Binary("00011"); // 3
        Binary binaryAnd3 = Binary.and(binaryAnd1, binaryAnd2);
        System.out.println(binaryAnd3.getValue()); // 00010 = 2

        Binary binaryOr1 = new Binary("01010"); // 10
        Binary binaryOr2 = new Binary("00011"); // 3
        Binary binaryOr3 = Binary.or(binaryOr1, binaryOr2);
        System.out.println(binaryOr3.getValue()); // 01011 = 11
    }
}
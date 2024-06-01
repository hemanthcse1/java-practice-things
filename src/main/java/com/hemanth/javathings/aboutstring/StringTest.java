package com.hemanth.javathings.aboutstring;

public class StringTest {

    public static void main(String[] args) {

        // String vs StringBuilder vs StringBuffer performance test

        System.out.println("\n-------String vs StringBuilder vs StringBuffer performance test------\n");

        String str = "";
        long stStartTime = System.nanoTime();
        for (int i = 0; i< 10000; i++){
            str += "a";
        }
        long stEndTime = System.nanoTime();

        System.out.println("String time -> "+(stStartTime-stEndTime));

        StringBuilder sb = new StringBuilder();
        long sbStartTime = System.nanoTime();
        for (int i =0; i< 10000; i++){
            sb.append("a");
        }
        long sbEndTime = System.nanoTime();

        System.out.println("StringBuilder time -> "+(sbEndTime-sbStartTime));


        StringBuffer stringBuffer = new StringBuffer();
        long sbfStartTime = System.nanoTime();
        for (int i = 0; i< 10000; i++){
            stringBuffer.append("a");
        }
        long sbfEndTime = System.nanoTime();

        System.out.println("StringBuffer time -> "+(sbfEndTime-sbfStartTime));





    }
}

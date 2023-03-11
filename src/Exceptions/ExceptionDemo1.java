package Exceptions;

import Utils.ExcelReader;

import java.io.IOException;

public class ExceptionDemo1 {
    public static void main(String[] args) throws IOException {
        System.out.println("line1");
        System.out.println("line2");

        System.out.println("line3");
        System.out.println("line4");
        System.out.println("line5");
        System.out.println("line6");
        //try {
        //      System.out.println(10 / 0);
        //   } catch (Exception e) {
        System.out.println("line7");
        System.out.println("line8");

/*try {
    ExcelReader.read();

}catch(Exception e){
    System.out.println(e);
    }*/
        test();
    }
        static void test() throws IOException{
  /*try {
    ExcelReader.read();

}catch(Exception e){
    System.out.println(e);
    }*/
    ExcelReader.read();
        }


    }



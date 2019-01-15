package chapter10;

import java.util.Date;

public class TestBox {
    Integer i;
    int j;
    public static void main(String[] args) {
        TestBox testBox = new TestBox();
        String date=String.format("%tc", new Date());
        System.out.println(date);
        // testBox.go();   
    }
    public void go(){
        j=i;
        System.out.println(j);
        System.out.println(j);
        
    }
}
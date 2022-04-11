package org.example;

import java.util.Arrays;

/**
 * @author Donquixote
 * @date 2022/04/11
 **/
public class BytesToString {
    public static void byteArrayToString() {
        // two methods to declare bytes array
        byte[] byteArray1 = new byte[10];
        byte[] byteArray2 = {1, 2, 3, 4};

        byte[] bytes = " convert a byte Array to String in Java without character encoding ".getBytes();
        System.out.println(Arrays.toString(bytes));

        // Create a string from the byte array
        // without specifying character encoding
        String string = new String(bytes);
        System.out.println(string);
    }

    public static void bytesArrayToLong() {
        byte[] byteArray = "12313".getBytes();
        String number = new String(byteArray);
        long l = Long.parseLong(number);
        System.out.println(l);
    }

    // 1. Java allow cast a superclass to subclass,but not recommended
    // 2. after JDK1.7 we can use String in Switch case

    public static void main(String[] args) {
        BytesToString.bytesArrayToLong();
    }
}

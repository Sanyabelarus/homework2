package com.company;

public class Main {

    public static void main(String[] args) {
        double number = Math.random();
        System.out.println(number);
        StringBuilder s = new StringBuilder();
        while(number>0) {
            s.insert(0, number%10);
            number = number / 10;
        }
        s.reverse();
        System.out.println(s.charAt(0));
    }
}

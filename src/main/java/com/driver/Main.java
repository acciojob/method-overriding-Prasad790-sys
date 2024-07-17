package com.driver;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        B obj = new B();
        A a=new A();
        System.out.println(a.meth());
        System.out.println(obj.meth());
    }
}
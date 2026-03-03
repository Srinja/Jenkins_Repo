package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello from Jenkins + Maven!");
        App2.sayHello();
    }

}

class App2 {
    public static void sayHello() {
        System.out.println("Hello from App2 class");
    }

}




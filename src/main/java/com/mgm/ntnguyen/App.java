package com.mgm.ntnguyen;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        String version = App.class.getPackage().getImplementationVersion();
        System.out.println("You are running on version: " + version);
    }
}

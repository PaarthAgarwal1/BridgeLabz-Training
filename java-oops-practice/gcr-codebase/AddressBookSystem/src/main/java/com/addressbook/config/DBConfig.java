package com.addressbook.config;

public class DBConfig {

    private static final String URL = System.getenv("jdbc:mysql://localhost:3306/?user=root");
    private static final String USER = System.getenv("root");
    private static final String PASSWORD = System.getenv("Paarth@29122003");

    public static String getUrl() {
        return URL;
    }

    public static String getUser() {
        return USER;
    }

    public static String getPassword() {
        return PASSWORD;
    }
}

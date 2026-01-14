package org.example;

public class DatabaseConnection {
    private boolean conected;

    public void connect(){
        conected=true;
        System.out.println("Database connected");
    }

    public void disconnect(){
        conected=false;
        System.out.println("Database disconnected");
    }

    public boolean isConnected(){
        return conected;
    }

}

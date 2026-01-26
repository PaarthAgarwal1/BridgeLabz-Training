package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

class Car{
    public String brand;
    public String model;
    public int price;
    Car(String brand,String model,int price){
        this.brand=brand;
        this.model=model;
        this.price=price;
    }
}
public class CarToJson {
    public static void main(String[] args) {
        try {
            Car car=new Car("Toyota", "Fortuner", 3500000);
            ObjectMapper mapper=new ObjectMapper();
            String json =mapper.writeValueAsString(car);
            System.out.println(json);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

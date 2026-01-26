package org.example;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class FilterUsersByAge {
    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();

            // Read JSON array
            JsonNode rootNode = mapper.readTree(new File("Data/users.json"));

            if (!rootNode.isArray()) {
                System.out.println("JSON is not an array");
                return;
            }

            System.out.println("Users with age > 25:\n");

            for (JsonNode user : rootNode) {
                if (user.has("age") && user.get("age").isInt()) {
                    int age = user.get("age").asInt();

                    if (age > 25) {
                        System.out.println("Name: " + user.get("name").asText() + ", Age: " + age);
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
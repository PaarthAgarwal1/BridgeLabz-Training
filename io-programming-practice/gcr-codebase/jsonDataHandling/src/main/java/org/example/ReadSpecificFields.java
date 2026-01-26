package org.example;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class ReadSpecificFields{
    public static void main(String[] args) {
        String filePath = "Data/users.json";
        try {
            ObjectMapper mapper = new ObjectMapper();
            // Read JSON file (ARRAY)
            JsonNode rootNode = mapper.readTree(new File(filePath));
            // Loop through array
            for (JsonNode userNode : rootNode) {
                String name = userNode.get("name").asText();
                String email = userNode.get("email").asText();


                System.out.println("Name: " + name);
                System.out.println("Email: " + email);
                System.out.println("--------------------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package org.example;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class JsonValidationBasic {
    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            JsonNode rootNode = mapper.readTree(new File("Data/users.json"));

            if (!rootNode.isArray()) {
                System.out.println("JSON is not an array");
                return;
            }

            for (JsonNode node : rootNode) {

                if (node.hasNonNull("id") && node.hasNonNull("name") && node.hasNonNull("age") && node.hasNonNull("email") && node.hasNonNull("skills")) {
                    if (node.get("id").isInt() && node.get("name").isTextual() && node.get("age").isInt() && node.get("email").isTextual() && node.get("skills").isArray()) {
                        System.out.println("Valid User: " + node.get("name").asText());

                    } else {
                        System.out.println("Invalid data type in user: " + node);
                    }

                } else {
                    System.out.println("Required fields missing in user: " + node);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
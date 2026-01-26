package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

class User {
    private int id;
    private String name;
    private String email;
    private List<String> skills;

    // Constructor
    public User(int id, String name, String email, List<String> skills) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.skills = skills;
    }

    // Getters (important for Jackson)
    public int getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public List<String> getSkills() { return skills; }
}

public class ListToJson {
    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();

            List<User> users = new ArrayList<>();
            users.add(new User(101, "Paarth Agarwal", "paarth@gmail.com", Arrays.asList("Java", "React")));
            users.add(new User(102, "Amit Sharma", "amit@gmail.com", Arrays.asList("Spring", "MySQL")));

            // Convert List to JSON Array
            String jsonArray = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(users);

            System.out.println(jsonArray);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
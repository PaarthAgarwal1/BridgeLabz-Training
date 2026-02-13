package com.addressbook.dao;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class AddressBookRestDAO {

    private static final String SERVER_URL = "http://localhost:3000/contacts";

    private final HttpClient client = HttpClient.newHttpClient();

    public void getContactsFromServer() {
        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(SERVER_URL))
                    .GET()
                    .build();

            HttpResponse<String> response =
                    client.send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println("Response from Server:");
            System.out.println(response.body());

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // restore interrupt status
            System.err.println("Request was interrupted");
        } catch (IOException e) {
            System.err.println("IO Error: " + e.getMessage());
        }
    }
}

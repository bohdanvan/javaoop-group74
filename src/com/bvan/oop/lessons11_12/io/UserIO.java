package com.bvan.oop.lessons11_12.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author bvanchuhov
 */
public class UserIO {

    public static void main(String[] args) {
        String fileName = "files/users.csv";

        // try-with-resources
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String s = reader.readLine();
            User user = parseUser(s);
            System.out.println(user);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static User parseUser(String s) {
        String[] tokens = s.split(",");
        String name = tokens[0];
        int age = Integer.parseInt(tokens[1]);
        return new User(name, age);
    }
}

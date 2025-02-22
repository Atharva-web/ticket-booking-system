/*
 * This source file was generated by the Gradle 'init' task
 */
package ticket.booking;

import ticket.booking.entities.User;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);

    public static void signUpService() throws IOException {
        System.out.print("Username: ");
        String username = sc.next();

        System.out.print("Password: ");
        String password = sc.next();

        User user = new User(username, password);

        // save user to db
        // our db is local json file

        File file = new File("users.json");
        ObjectMapper objectMapper = new ObjectMapper();

        // Read existing users (if empty, create a new list)
        List<User> users = file.length() > 2  // Ensures file isn't just `[]`
                ? objectMapper.readValue(file, new TypeReference<List<User>>() {})
                : new ArrayList<>();

        // Add new user
        users.add(user);

        //return user;
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Ticket-booking Application");

        boolean loggedIn = false;

        System.out.println("MENU");
        System.out.println("1. Signup");
        System.out.println("2. Login");

        while (true) {
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            if (choice == 1) {
                signUpService();
                break;
            } else if (choice == 2) {
//                loginService();
                break;
            } else {
                System.out.println("wrong input");
            }
        }


        while (loggedIn) {
            // menu
        }
    }
}

package ticket.booking.entities;

import java.util.List;

public class User {
    private String userId; // auto-generate
    private String userName;
    private String password;
    // private String hashedPassword;
    private List<Ticket> ticketsBooked;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
}

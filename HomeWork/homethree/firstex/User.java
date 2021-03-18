package homework.homethree.firstex;

import java.util.Scanner;

public class User {
    String username;
    String password;
    Basket basket;

    public User(String username, String password, Basket basket) {
        this.username = username;
        this.password = password;
        this.basket = basket;
    }

    public String getUsername() {

        return username;
    }

    public String getPassword() {

        return password;
    }
}

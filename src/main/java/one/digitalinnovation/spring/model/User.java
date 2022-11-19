package one.digitalinnovation.spring.model;

import java.time.LocalDate;

public class User {

    private String email;
    private String password;
    private Cart cart;



    public User() {
    }

    public User(String email, String password, Cart cart) {
        this.email = email;
        this.password = password;
        this.cart = cart;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", cart=" + cart +
                '}';
    }
}

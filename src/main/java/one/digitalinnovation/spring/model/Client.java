package one.digitalinnovation.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Client {
    //ATTRIBUTES
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String cpf;
    private User user;
    private String name;
    private Address address;
    private String phone;
    private LocalDate birthDate;
    private Cart cart;


    //CONSTRUCTS
    public Client() {

    }

    public Client(String cpf, User user, String name, Address address, String phone, LocalDate birthDate, Cart cart) {
        this.cpf = cpf;
        this.user = user;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.birthDate = birthDate;
        this.cart = cart;
    }


    //METHODS
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public LocalDate getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
    public Cart getCart() {
        return cart;
    }
    public void setCart(Cart cart) {
        this.cart = cart;
    }
    @Override
    public String toString() {
        return "Client{" +
                "cpf='" + cpf + '\'' +
                ", user=" + user +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", phone='" + phone + '\'' +
                ", birthDate=" + birthDate +
                ", cart=" + cart +
                '}';
    }
}

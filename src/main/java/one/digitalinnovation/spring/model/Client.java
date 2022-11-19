package one.digitalinnovation.spring.model;

import java.time.LocalDate;


public class Client {

    private User user;
    private String name;
    private Address address;
    private String phone;
    private LocalDate birthDate;

    public Client() {

    }
    public Client(User user, String name, Address address, String phone, LocalDate birthDate) {
        this.user = user;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.birthDate = birthDate;
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

    @Override
    public String toString() {
        return "Client{" +
                "user=" + user +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", phone='" + phone + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}

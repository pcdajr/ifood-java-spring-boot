package one.digitalinnovation.spring.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class Restaurant {

    private User user;
    private String cnpj;
    private String name;
    private String information;
    private Address address;
    private List<Product> products = new ArrayList<>();


    public Restaurant() {
    }

    public Restaurant(User user, String cnpj, String name, String information, Address address, List<Product> products) {
        this.user = user;
        this.cnpj = cnpj;
        this.name = name;
        this.information = information;
        this.address = address;
        this.products = products;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "user=" + user +
                ", cnpj='" + cnpj + '\'' +
                ", name='" + name + '\'' +
                ", information='" + information + '\'' +
                ", address=" + address +
                ", products=" + products +
                '}';
    }
}

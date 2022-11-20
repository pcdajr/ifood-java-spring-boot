package one.digitalinnovation.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Restaurant {

    //ATTRIBUTES
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String cnpj;
    private User user;
    private String name;
    private String information;
    private Address address;
    private List<Product> listProduct = new ArrayList<>();

    //CONSTRUCTS
    public Restaurant() {
    }
    public Restaurant(User user, String cnpj, String name, String information, Address address, List<Product> listProduct) {
        this.user = user;
        this.cnpj = cnpj;
        this.name = name;
        this.information = information;
        this.address = address;
        this.listProduct = listProduct;
    }


    //METHODS
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
    public List<Product> getListProduct() {
        return this.listProduct;
    }
    public void setListProduct(List<Product> listProduct) {
        this.listProduct = listProduct;

    }
    public void addProduct(Product product) {
       this.listProduct.add(product);
    }
    public void deleteProduct(Product product) {
        if (this.listProduct.contains(product)){
            this.listProduct.remove(product);
        }
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "user=" + user +
                ", cnpj='" + cnpj + '\'' +
                ", name='" + name + '\'' +
                ", information='" + information + '\'' +
                ", address=" + address +
                ", listProduct=" + listProduct +
                '}';
    }
}

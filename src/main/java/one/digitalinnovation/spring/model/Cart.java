package one.digitalinnovation.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Cart {

    //ATTRIBUTES
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Double freight;
    private Integer quantity;
    private List<Product> listProduct = new ArrayList<>();
    private Restaurant restaurant;

    //CONSTRUCTS
    public Cart() {
    }
    public Cart(Double freight, Integer quantity, List<Product> listProduct, Restaurant restaurant) {
        this.freight = freight;
        this.quantity = quantity;
        this.listProduct = listProduct;
        this.restaurant = restaurant;
    }


    //METHODS
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Double getFreight() {
        return freight;
    }
    public void setFreight(Double freight) {
        this.freight = freight;
    }
    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    public List<Product> getListProduct() {
        return listProduct;
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
    public Restaurant getRestaurant() {
        return restaurant;
    }
    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", freight=" + freight +
                ", quantity=" + quantity +
                ", listProduct=" + listProduct +
                ", restaurant=" + restaurant +
                '}';
    }
}

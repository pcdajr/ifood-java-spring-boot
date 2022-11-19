package one.digitalinnovation.spring.model;


public class Address {

    private String number;
    private String zip_code;
    private String road;
    private String district;
    private String city;
    private String state;


    public Address() {

    }

    public Address(String number ,String zip_code, String road, String district, String city, String state) {

        this.number = number;
        this.zip_code = zip_code;
        this.road = road;
        this.district = district;
        this.city = city;
        this.state = state;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getZip_code() {
        return zip_code;
    }

    public void setZip_code(String zip_code) {
        this.zip_code = zip_code;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "number='" + number + '\'' +
                ", zip_code='" + zip_code + '\'' +
                ", road='" + road + '\'' +
                ", district='" + district + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}

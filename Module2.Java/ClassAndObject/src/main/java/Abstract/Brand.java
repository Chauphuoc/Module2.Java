package Abstract;

public class Brand {
    private String brand,country;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Brand(String brand, String country) {
        this.brand = brand;
        this.country = country;
    }
}

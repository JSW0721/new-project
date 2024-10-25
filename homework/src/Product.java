public class Product implements Promotion{
    private String name;
    private Double price;
    private Double weight;

    public Product(String name, Double price, Double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price - getDiscountFee();
    }
    public Double getWeight() {
        return weight;
    }

    public double getDiscountFee(){
        switch (name) {
            case "grocery":
                return 2000;
            case "beauty":
                return 10000;
            default:
                return 0;
        }
    }
}

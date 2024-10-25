public class Cart {
    Product[] product;

    Cart(Product[] product) {
        this.product = product;
    }

    public int calculateDeliveryCharge() {
        int deliveryFees;

        double totalPrice = 0;
        double totalWeight = 0;

        for (Product value : product) {
            totalPrice = totalPrice + value.getPrice();
            totalWeight += value.getWeight();
        }

        if (totalWeight < 3) {
            deliveryFees = 1000;
        } else if (totalWeight < 10) {
            deliveryFees = 5000;
        } else {
            deliveryFees = 10000;
        }

        if ((totalPrice >= 3000)||(totalPrice < 10000)) {
            deliveryFees -= 1000;
        } else if (totalPrice > 10000) {
            deliveryFees = 0;
        }

        return deliveryFees;
    }
}
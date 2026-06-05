class Restaurant {
    double taxRate = 0.10;

    double calculateTotalBill(double foodPrice) {
        return foodPrice + (foodPrice * taxRate);
    }

    int estimateDeliveryTime() {
        return 40;
    }
}

class FastFoodRestaurant extends Restaurant {
    double taxRate = 0.15;

    double calculateTotalBill(double foodPrice) {
        return foodPrice + (foodPrice * taxRate);
    }

    int estimateDeliveryTime() {
        return 20;
    }
}

class FineDiningRestaurant extends Restaurant {

    int estimateDeliveryTime() {
        return 60;
    }
}

public class OnlineFoodOrderingSystem {
    public static void main(String[] args) {

        Restaurant r1 = new FastFoodRestaurant();
        Restaurant r2 = new FineDiningRestaurant();

        double price = 1000;

        System.out.println("Fast Food Bill: " + r1.calculateTotalBill(price));
        System.out.println("Fast Food Delivery Time: " + r1.estimateDeliveryTime() + " mins");

        System.out.println("Fine Dining Bill: " + r2.calculateTotalBill(price));
        System.out.println("Fine Dining Delivery Time: " + r2.estimateDeliveryTime() + " mins");
    }
}
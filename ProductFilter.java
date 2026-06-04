public class ProductFilter {

    public static void filterProducts(String category) {
        System.out.println("Searching products in category: " + category);
    }

    public static void filterProducts(int minPrice, int maxPrice) {
        System.out.println("Searching products between price: " + minPrice + " and " + maxPrice);
    }

    public static void filterProducts(String brand, boolean isBrand) {
        System.out.println("Searching products of brand: " + brand);
    }

    public static void filterProducts(String category, int minPrice, int maxPrice) {
        System.out.println("Searching in category: " + category + " with price between " + minPrice + " and " + maxPrice);
    }

    public static void filterProducts(String category, int minPrice, int maxPrice, String brand) {
        System.out.println("Searching in category: " + category + ", price: " + minPrice + "-" + maxPrice + ", brand: " + brand);
    }

    public static void main(String[] args) {
        filterProducts("electronics");
        filterProducts(100, 500);
        filterProducts("Apple", true);
        filterProducts("fashion", 50, 200);
        filterProducts("electronics", 200, 1000, "Samsung");
    }
}
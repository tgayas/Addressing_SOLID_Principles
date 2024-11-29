// Adding a new customer type requires modifying the DiscountCalculator class, violating the OCP.


public class DiscountCalculator {
    public double calculateDiscount(String customerType, double totalAmount) {
        if (customerType.equals("Regular")) {
            return totalAmount * 0.1; // 10% discount
        } else if (customerType.equals("Premium")) {
            return totalAmount * 0.2; // 20% discount
        } else if (customerType.equals("VIP")) {
            return totalAmount * 0.3; // 30% discount
        }
        return 0;
    }

    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();
        double discount = calculator.calculateDiscount("VIP", 1000);
        System.out.println("Discount: " + discount);
    }
}

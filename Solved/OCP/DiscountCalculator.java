// The DiscountCalculator class is open for extension but closed for modification.
// Adding a new customer type requires only implementing a new DiscountStrategy.


interface DiscountStrategy {
    double calculate(double totalAmount);
}

class RegularCustomerDiscount implements DiscountStrategy {
    @Override
    public double calculate(double totalAmount) {
        return totalAmount * 0.1;
    }
}

class PremiumCustomerDiscount implements DiscountStrategy {
    @Override
    public double calculate(double totalAmount) {
        return totalAmount * 0.2;
    }
}

class VIPCustomerDiscount implements DiscountStrategy {
    @Override
    public double calculate(double totalAmount) {
        return totalAmount * 0.3;
    }
}

class DiscountCalculator {
    public double calculateDiscount(DiscountStrategy strategy, double totalAmount) {
        return strategy.calculate(totalAmount);
    }

    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();
        DiscountStrategy strategy = new VIPCustomerDiscount();
        double discount = calculator.calculateDiscount(strategy, 1000);
        System.out.println("Discount: " + discount);
    }
}

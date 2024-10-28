package ua.edu.ucu.flowerstore;
import java.util.List;

public class CreditCardPaymentStrategy implements Payment {
    @Override
    public double pay(List<Item> items) {
        return 10;
    }
}
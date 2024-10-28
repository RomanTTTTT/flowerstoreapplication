package ua.edu.ucu.flowerstore;
import java.util.LinkedList;

import lombok.Getter;
import lombok.Setter;
@Getter @Setter
public class Order {
    private LinkedList<Item> items;
    private Payment paymentStrategy;
    private Delivery deliveryStrategy;
    public Order(LinkedList<Item> items, Delivery delivery) {
        this.setItems(items);
        this.setDeliveryStrategy(delivery);
    }
    public double calculateTotalPrice() {
        return 10;
    } 
}


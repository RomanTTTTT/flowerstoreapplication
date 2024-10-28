package ua.edu.ucu.flowerstore;
import java.util.List;

public interface Payment {
    double pay(List<Item> items);
}

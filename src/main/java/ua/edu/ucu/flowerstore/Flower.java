package ua.edu.ucu.flowerstore;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Flower {
    private double price;
    private FlowerType type;
    private double sepalLength;
    private FlowerColor color;
    public Flower(Flower flower) {
        this.price = flower.getPrice();
        this.sepalLength = flower.getSepalLength();
        this.color = flower.getColor();
        this.type = flower.getType();
    }
    public Flower(double price, double sepalLength,
                 FlowerColor color, FlowerType type) {
        this.setPrice(price);
        this.setSepalLength(sepalLength);
        this.setColor(color);
        this.setType(type);
    }
}

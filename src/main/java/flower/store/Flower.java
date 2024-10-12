package flower.store;

import lombok.Getter;
import lombok.Setter;

@Setter
public class Flower {
    @Getter
    private double sepalLength;
    private FlowerColor flowerColor;
    @Getter
    private double price;
    @Getter
    private FlowerType flowerType;

    public Flower() {
        this.flowerType = null;
        this.price = 0.0;
        this.sepalLength = 0.0;
        this.flowerColor = null;
    }

    public Flower(Flower nextFlower) {
        this.flowerType = nextFlower.flowerType;
        this.price = nextFlower.price;
        this.sepalLength = nextFlower.sepalLength;
        this.flowerColor = nextFlower.flowerColor;
    }

    public void setColor(FlowerColor color) {
        this.flowerColor = color;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    public String getColor() {
        return flowerColor.toString();
    }
}
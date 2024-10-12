package flower.store;

import lombok.Getter;

@Getter
public class FlowerPack {
    private final Flower flower;
    private int amount;

    public FlowerPack(Flower flower, int amount) {
        this.flower = new Flower(flower);
        this.amount = amount;
    }

    public void setQuantity(int newAmount) {
        this.amount = Math.max(newAmount, 1);
    }

    public double getPrice() {
        return flower.getPrice() * amount;
    }
}
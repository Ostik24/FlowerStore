package flower.store;

import java.util.LinkedList;
import java.util.List;

public class FlowerBucket extends Item {
    private List<FlowerPack> packsOfFlowers = new LinkedList<>();

    @Override
    public double getPrice() {
        double totalPrice = 0;

        for (FlowerPack pack : packsOfFlowers) {
            totalPrice += pack.getPrice();
        }
        return totalPrice;
    }

    public void add(FlowerPack packOfFlowers) {
        packsOfFlowers.add(packOfFlowers);
    }
}
package U7T1;

import java.util.ArrayList;

public class UsedCarLot {
    private ArrayList<Car> inventory;

    public UsedCarLot() {
        inventory = new ArrayList<Car>();
    }

    public ArrayList<Car> getInventory() {
        return inventory;
    }

    public void addCar(Car newCar) {
        inventory.add(newCar);
    }

    public boolean swap(int index1, int index2) {
        if (index1 < 0 || index1 >= inventory.size() || index2 < 0 || index2 >= inventory.size()) {
            return false;
        }
        Car replacedCar = inventory.set(index2, inventory.get(index1));
        inventory.set(index1, replacedCar);
        return true;
    }
}

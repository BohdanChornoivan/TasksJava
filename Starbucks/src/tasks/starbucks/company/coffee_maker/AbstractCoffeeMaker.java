package tasks.starbucks.company.coffee_maker;

import tasks.starbucks.company.coffee.CoffeeType;
import tasks.starbucks.company.coffee.coffee_drinks.BaseCoffee;
import tasks.starbucks.company.product.IngredientStorage;

public abstract class AbstractCoffeeMaker {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract boolean isMakeCoffee(IngredientStorage storage, CoffeeType coffeeType, boolean sugar);

    public abstract void makeCoffee(IngredientStorage storage, CoffeeType coffeeType, boolean sugar);


    public boolean interactionOfStorageWithTheBaseCoffee(IngredientStorage storage, BaseCoffee baseCoffee, int needSugar) {

        if (storage.getCup() >= baseCoffee.getCup() &&
                storage.getWater() >= baseCoffee.getWater() &&
                storage.getCoffeeBeans() >= baseCoffee.getCoffeeBeans() &&
                storage.getMilk() >= baseCoffee.getCoffeeBeans() &&
                storage.getSugar() >= needSugar) {

            return true;
        }

        return false;
    }
}

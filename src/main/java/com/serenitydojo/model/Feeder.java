package com.serenitydojo.model;

public class Feeder {


    public FoodType feeds(AnimalType animal, boolean isPremium) {
        FoodType food;

        switch (animal) {
            case CAT:
                food = (isPremium) ? FoodType.SALMON : FoodType.TUNA;
                break;
            case DOG:
                food = (isPremium) ? FoodType.DELUXE_DOG_FOOD : FoodType.DOG_FOOD;
                break;
            case HAMSTER:
                food = (isPremium) ? FoodType.LETTUCE : FoodType.CABBAGE;
                break;
            default:
                food = FoodType.UNKNOWN;

        }

        return food;

    }
}

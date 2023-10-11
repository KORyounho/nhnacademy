package useclass;

import java.awt.Color;

public class Apple {
    Color color;
    int calories;
    int weight;

    public Apple(Color color, int calories, int weight) {
        this.color = color;
        this.calories = calories;
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public int getCalories() {
        return calories;
    }

    public int getWeight() {
        return weight;
    }
}

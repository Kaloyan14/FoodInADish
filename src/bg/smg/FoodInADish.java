package bg.smg;

import javax.swing.*;
import java.awt.*;

public class FoodInADish<T> extends DrawableObject implements Comparable<FoodInADish<T>>{
    private T food;
    private String dishColor;
    @Override
    public int compareTo(FoodInADish<T> o) {
        if(food instanceof Food && o.getFood() instanceof Food) {
            if(food instanceof Fruit && o.getFood() instanceof Vegetable) return -1;
            else if(food instanceof Vegetable && o.getFood() instanceof Fruit) return 1;
            else {
                return Double.compare(((Food) food).getKg(), ((Food) o.getFood()).getKg());
            }
        }
        return 0;
    }

    public FoodInADish() {
        food = null;
        dishColor = "";
    }

    public FoodInADish(T food, String dishColor) {
        this.food = food;
        this.dishColor = dishColor;
    }

    @Override
    public String toString() {
        return "A " + food + "in a " + dishColor + " dish";
    }

    @Override
    public JPanel draw() {
        ImageIcon foodIcon = new ImageIcon("resource/" + ((Food) food).getName() + ".png");
        ImageIcon dishIcon = new ImageIcon("resource/" + dishColor + ".png");
        return new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                dishIcon.paintIcon(this, g, getxCoord(), getyCoord() + 50);
                foodIcon.paintIcon(this, g, getxCoord(), getyCoord());
            }
        };
    }

    public T getFood() {
        return food;
    }

    public void setFood(T food) {
        this.food = food;
    }

    public String getDishColor() {
        return dishColor;
    }

    public void setDishColor(String dishColor) {
        this.dishColor = dishColor;
    }
}

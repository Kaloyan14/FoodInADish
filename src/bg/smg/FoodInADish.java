package bg.smg;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;

public class FoodInADish<T> extends DrawableObject implements Comparable<FoodInADish<T>>{
    private T food;
    private String dishColor;
    @Override
    public int compareTo(FoodInADish<T> o) {
        if(food instanceof Food && o.getFood() instanceof Food) {
            if(food instanceof Fruit && o.getFood() instanceof Vegetable) return 1;
            else if(food instanceof Vegetable && o.getFood() instanceof Food) return -1;
            else {
                return (int)(((Food) food).getKg() - ((Food) o.getFood()).getKg());
            }
        }
        return 0;
    }

    public FoodInADish() {
        food = (T) new Food();
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
        JPanel panel = new JPanel();
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("resource/" + ((Food) food).getName() + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Graphics g = img.getGraphics();
        g.drawImage(img, getxCoord(), getyCoord(), getWidth(), getHeight(), panel);
        panel.paint(g);

        try {
            img = ImageIO.read(new File("resource/" + dishColor + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        g = img.getGraphics();
        g.drawImage(img, getxCoord(), getyCoord(), getWidth(), getHeight(), panel);
        panel.paint(g);
        panel.repaint();
        return panel;
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

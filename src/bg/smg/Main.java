package bg.smg;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<FoodInADish<Food>> list = new ArrayList<FoodInADish<Food>>();
        list.add(new FoodInADish<>(new Fruit("strawberry", 2, true), "green"));
        list.add(new FoodInADish<>(new Fruit("banana", 1, true), "red"));
        list.add(new FoodInADish<>(new Vegetable("lettuce", 3, true), "blue"));
        list.add(new FoodInADish<>(new Fruit("blueberry", 4, true), "darkblue"));
        list.add(new FoodInADish<>(new Vegetable("pepper", 7, false), "white"));
        list.add(new FoodInADish<>(new Fruit("strawberry", 2, true), "darkblue"));
        list.add(new FoodInADish<>(new Fruit("banana", 2, true), "yellow"));
        list.add(new FoodInADish<>(new Vegetable("lettuce", 3, true), "red"));
        list.add(new FoodInADish<>(new Vegetable("pepper", 1, false), "green"));
        list.add(new FoodInADish<>(new Fruit("blueberry", 4, true), "white"));
        Collections.sort(list);
        JFrame frame = new JFrame("Food in a dish");
        frame.setSize(new Dimension(1500,1000));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        int i = 0;
        JPanel containerPanel = new JPanel();
        containerPanel.setLayout(new GridLayout());
        for(FoodInADish<Food> o : list) {
            o.setxCoord(i);
            o.setyCoord(400);
            JPanel panel = o.draw();
            containerPanel.add(panel);
            i++;
        }
        frame.add(containerPanel);
        frame.setVisible(true);

    }
}

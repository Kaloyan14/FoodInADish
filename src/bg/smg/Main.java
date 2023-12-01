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
        list.add(new FoodInADish<Food>(new Fruit("strawberry", 2, true), "green"));
        list.add(new FoodInADish<Food>(new Fruit("banana", 1, true), "red"));
        Collections.sort(list);
        JFrame frame = new JFrame("Food in a dish");
        frame.setSize(new Dimension(1000,1000));
        for(Object o : list) {
            JPanel panel = ((FoodInADish<Food>)o).draw();
            panel.repaint();
            frame.add(panel);
        }

        frame.setVisible(true);

    }
}

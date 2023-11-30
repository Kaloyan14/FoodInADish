package bg.smg;

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

    @Override
    public String toString() {
        return "A " + food + "in a " + dishColor + " dish";
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

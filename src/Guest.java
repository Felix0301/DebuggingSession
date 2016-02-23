import java.util.Stack;

/**
 * Created by Felix on 23.02.2016.
 */
public class Guest {
    public String name;
    public double consumedCalories = 0.0;

    public Guest(String name){
        this.name = name;
    }

    public void consume(double calories){
       consumedCalories += calories;
    }

    public void takeSlice(Pizza pizza){
        consume(((Slice)pizza.slices.pop()).calories);
    }

    public void drink(Stack drinks){
        consume(((Drink)drinks.pop()).calories);
    }
}

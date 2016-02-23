import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Stack;

/**
 * Created by Felix on 23.02.2016.
 */
public class Pizza {

    public Stack slices;
    public int calories;

    public Pizza(Topping topping){
        this.calories = topping.calories;
    }

    public void slice(int nrOfSlices){
        slices = new Stack();
        for (int i = 0;i < nrOfSlices; i++){
            slices.push(new Slice(calories/nrOfSlices));
        }
    }
}

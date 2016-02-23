/**
 * Created by Felix on 23.02.2016.
 */
public enum Topping {
    DIETPILLS(0),
    MARGHERITA (1000),
    SALAMI(1400),
    PROSCIUTTO(1200);

    public final int calories;

    Topping(int calories){
        this.calories = calories;
    }
}

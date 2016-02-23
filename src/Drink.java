/**
 * Created by Felix on 23.02.2016.
 */
public enum Drink {
        BEER (310) ,
        BIRTHDAYSHOT (280);

        public final double calories;

        Drink(double calories){
            this.calories = calories;
        }
}

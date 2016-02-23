import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Felix on 23.02.2016.
 */
public class Tests {

    @Test
    public void test1(){
        PizzaParty party = new PizzaParty(4,Topping.DIETPILLS,4);
        party.startTheFeast();
        Assert.assertTrue(party.consumedCalories == party.providedCalories);
    }

    @Test
    public void test2(){
        PizzaParty party = new PizzaParty(4,Topping.SALAMI,4);
        party.startTheFeast();
        Assert.assertTrue(party.consumedCalories == party.providedCalories);
    }

    @Test
    public void test3(){
        PizzaParty party = new PizzaParty(4,Topping.DIETPILLS,7);
        party.startTheFeast();
        Assert.assertTrue(party.consumedCalories == party.providedCalories);
    }

    @Test
    public void test4(){
        PizzaParty party = new PizzaParty(7,Topping.PROSCIUTTO,7);
        party.startTheFeast();
        Assert.assertTrue(party.consumedCalories == party.providedCalories);
    }

    @Test
    public void test5(){
        PizzaParty party = new PizzaParty(3,Topping.SALAMI,3);
        party.startTheFeast();
        Assert.assertTrue(party.consumedCalories == party.providedCalories);
    }

    @Test
    public void test6(){
        PizzaParty party = new PizzaParty(3,Topping.SALAMI,2);
        party.startTheFeast();
        Assert.assertTrue(party.consumedCalories == party.providedCalories);
    }

    @Test
    public void test7(){
        PizzaParty party = new PizzaParty(7,Topping.DIETPILLS,4);
        party.startTheFeast();
        Assert.assertTrue(party.consumedCalories == party.providedCalories);
    }

    @Test
    public void test8(){
        PizzaParty party = new PizzaParty(9,Topping.DIETPILLS,4);
        party.startTheFeast();
        Assert.assertTrue(party.consumedCalories == party.providedCalories);
    }

    @Test
    public void test9(){
        PizzaParty party = new PizzaParty(4,Topping.MARGHERITA,6);
        party.startTheFeast();
        Assert.assertTrue(party.consumedCalories == party.providedCalories);
    }
}

package lab.assignment.beforerefactoring.clientcode;

import lab.assignment.beforerefactoring.AmericanoMaker;
import lab.assignment.beforerefactoring.CapuccinoMaker;
import lab.assignment.beforerefactoring.CoffeeMaker;
import lab.assignment.beforerefactoring.MochaMaker;

public class CoffeeClient {


    public static void main(String[] args) {
        CoffeeMaker starbuzz = new MochaMaker();
        starbuzz.makeCoffee();

        System.out.println("********************");

        starbuzz = new CapuccinoMaker();
        starbuzz.makeCoffee();

        System.out.println("********************");

        starbuzz = new AmericanoMaker();
        starbuzz.makeCoffee();

    }

}

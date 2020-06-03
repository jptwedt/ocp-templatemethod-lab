package lab.assignment.beforerefactoring;

public abstract class CoffeeMaker {
    public final void makeCoffee(){
        boilWater();
        brewEspresso();
        addIngredients();
        finalTouch();
        System.out.println(">>Serving coffee");
    }

    // default implementation
    private void boilWater() {
        System.out.println("Boiling water");
    }
    // default implementation
    private void brewEspresso() {
        System.out.println("Brewing espresso");
    }

    protected abstract void addIngredients();
    protected abstract void finalTouch();
}

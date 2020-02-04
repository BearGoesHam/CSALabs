package DataDataData;

public class Cereal
{
    private String name;
    private String type;
    private int calories,protein,fat,sodium,fiber,sugar,potassium,vitamins,shelf,weight;
    double carbohydrates,cups;
    float rating;


    public Cereal(String name, String type, int calories, int protein, int fat, int sodium, int fiber,
                  double carbohydates, int sugar, int potassium, int vitamins, int shelf, int weight,
                  double cups, float rating)
    {
        this.name = name;
        this.type = type;
        this.calories = calories;
        this.protein = protein;
        this.fat = fat;
        this.sodium = sodium;
        this.fiber = fiber;
        this.sugar = sugar;
        this.potassium = potassium;
        this.vitamins = vitamins;
        this.shelf = shelf;
        this.weight = weight;
        this.carbohydrates = carbohydates;
        this.cups = cups;
        this.rating = rating;
    }


    public String getName()
    {
        return this.name;
    }
    public String getType()
    {
        return this.type;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public int getCalories() {
        return calories;
    }

    public int getFat() {
        return fat;
    }

    public int getProtein() {
        return protein;
    }

    public int getFiber() {
        return fiber;
    }

    public int getSodium() {
        return sodium;
    }

    public int getPotassium() {
        return potassium;
    }

    public int getShelf() {
        return shelf;
    }

    public int getSugar() {
        return sugar;
    }

    public int getWeight() {
        return weight;
    }

    public int getVitamins() {
        return vitamins;
    }

    public double getCups() {
        return cups;
    }

    public float getRating() {
        return rating;
    }
    public String toString()
    {
        return "" + getName() + " " + getType() + " " + getCalories() + " " + getProtein() + " " + getFat() + " " + getSodium() +
                " " + getFiber() + " " + getCarbohydrates() + " " + getSugar() + " " + getPotassium() + " " + getVitamins() + " "
                + getShelf() + " " + getWeight() + " " + getCups() + " " + getRating();
    }
}

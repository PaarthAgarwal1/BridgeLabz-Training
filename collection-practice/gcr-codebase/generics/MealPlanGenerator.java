interface MealPlan {
    String getPlanName();
    int getCalories();
    boolean isValid();
}

//Vegetarian Meal
class VegetarianMeal implements MealPlan {
    private int calories;

    VegetarianMeal(int calories) {
        this.calories = calories;
    }

    public String getPlanName() {
        return "Vegetarian Meal";
    }

    public int getCalories() {
        return calories;
    }

    public boolean isValid() {
        return calories >= 400 && calories <= 800;
    }
}

//Vegan Meal
class VeganMeal implements MealPlan {
    private int calories;

    VeganMeal(int calories) {
        this.calories = calories;
    }

    public String getPlanName() {
        return "Vegan Meal";
    }

    public int getCalories() {
        return calories;
    }

    public boolean isValid() {
        return calories >= 300 && calories <= 700;
    }
}

//Keto Meal
class KetoMeal implements MealPlan {
    private int calories;

    KetoMeal(int calories) {
        this.calories = calories;
    }

    public String getPlanName() {
        return "Keto Meal";
    }

    public int getCalories() {
        return calories;
    }

    public boolean isValid() {
        return calories >= 500 && calories <= 900;
    }
}

//High Protein Meal
class HighProteinMeal implements MealPlan {
    private int calories;

    HighProteinMeal(int calories) {
        this.calories = calories;
    }

    public String getPlanName() {
        return "High Protein Meal";
    }

    public int getCalories() {
        return calories;
    }

    public boolean isValid() {
        return calories >= 600 && calories <= 1000;
    }
}

//Generic Meal Class
class Meal<T extends MealPlan> {
    private T mealPlan;

    Meal(T mealPlan) {
        this.mealPlan = mealPlan;
    }

    void showMeal() {
        System.out.println(
            "Meal Type: " + mealPlan.getPlanName() +
            ", Calories: " + mealPlan.getCalories()
        );
    }

    T getMealPlan() {
        return mealPlan;
    }
}

//Generic Method
class MealGenerator {

    public static <T extends MealPlan> void generateMealPlan(T meal) {
        if (meal.isValid()) {
            System.out.println("Meal Plan Generated Successfully!");
            System.out.println("Meal: " + meal.getPlanName());
            System.out.println("Calories: " + meal.getCalories());
        } else {
            System.out.println("Invalid Meal Plan. Cannot generate.");
        }
    }
}

public class MealPlanGenerator {

    public static void main(String[] args) {

        VegetarianMeal vegMeal = new VegetarianMeal(600);
        VeganMeal veganMeal = new VeganMeal(500);
        KetoMeal ketoMeal = new KetoMeal(850);
        HighProteinMeal proteinMeal = new HighProteinMeal(900);

        Meal<VegetarianMeal> meal1 = new Meal<>(vegMeal);
        Meal<VeganMeal> meal2 = new Meal<>(veganMeal);
        Meal<KetoMeal> meal3 = new Meal<>(ketoMeal);
        Meal<HighProteinMeal> meal4 = new Meal<>(proteinMeal);

        meal1.showMeal();
        meal2.showMeal();
        meal3.showMeal();
        meal4.showMeal();

        System.out.println();

        MealGenerator.generateMealPlan(vegMeal);
        MealGenerator.generateMealPlan(veganMeal);
        MealGenerator.generateMealPlan(ketoMeal);
        MealGenerator.generateMealPlan(proteinMeal);
    }
}

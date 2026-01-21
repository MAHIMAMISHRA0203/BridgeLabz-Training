import java.util.*;

// ===============================
// MEAL PLAN INTERFACE
// ===============================
interface MealPlan {
    void showMeal();
}

// ===============================
// DIFFERENT MEAL TYPES
// ===============================
class VegetarianMeal implements MealPlan {
    public void showMeal() {
        System.out.println("Vegetarian Meal: Rice, Dal, Vegetables");
    }
}

class VeganMeal implements MealPlan {
    public void showMeal() {
        System.out.println("Vegan Meal: Quinoa, Beans, Salad");
    }
}

class KetoMeal implements MealPlan {
    public void showMeal() {
        System.out.println("Keto Meal: Eggs, Avocado, Chicken");
    }
}

class HighProteinMeal implements MealPlan {
    public void showMeal() {
        System.out.println("High Protein Meal: Paneer, Eggs, Lentils");
    }
}

// ===============================
// GENERIC MEAL CLASS
// ===============================
class Meal<T extends MealPlan> {

    private T meal;

    Meal(T meal) {
        this.meal = meal;
    }

    T getMeal() {
        return meal;
    }
}

// ===============================
// MEAL GENERATOR (GENERIC METHOD)
// ===============================
class MealGenerator {

    // BOUNDED GENERIC METHOD
    static <T extends MealPlan> void generateMeal(T meal) {
        System.out.println("🍴 Your Personalized Meal Plan:");
        meal.showMeal();
        System.out.println("-----------------------------");
    }
}


public class PersonalizedMealPlan {

    public static void main(String[] args) {

        // Creating different meal plans
        Meal<VegetarianMeal> vegMeal =
                new Meal<>(new VegetarianMeal());

        Meal<VeganMeal> veganMeal =
                new Meal<>(new VeganMeal());

        Meal<KetoMeal> ketoMeal =
                new Meal<>(new KetoMeal());

        Meal<HighProteinMeal> proteinMeal =
                new Meal<>(new HighProteinMeal());

        // Generating meals dynamically
        MealGenerator.generateMeal(vegMeal.getMeal());
        MealGenerator.generateMeal(veganMeal.getMeal());
        MealGenerator.generateMeal(ketoMeal.getMeal());
        MealGenerator.generateMeal(proteinMeal.getMeal());
    }
}

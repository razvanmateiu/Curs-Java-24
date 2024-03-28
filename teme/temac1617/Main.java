package teme.temac1617;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Design a recipe book where you can add recipes, and search for recipes based on ingredients.
//        class Recipe {
//            private String name;
//            private List<String> ingredients;
//        }
//
//        -Adaugati in clasa: constructor, getteri, setteri, metoda addRecipe(), metoda public
//        boolean hasIngredient(String ingredient).
//        -In clasa Main folositi acest array pentru a apela metoda hasIngredient() de mai sus:
//        List<Recipe> recipesWithMilk = new ArrayList<>();

        List<Recipe> recipesWithMilk = new ArrayList<>();
        Recipe recipe1 = new Recipe("prajitura", null);
        if (recipe1.hasIngredient("milk")) recipesWithMilk.add(recipe1);
        recipe1.addRecipe(recipe1);

    }
}

package teme.temac1617;

import java.util.ArrayList;
import java.util.List;

public class Recipe {

    private String name;
    private List<String> ingredients;
    ArrayList<Recipe> recipes = new ArrayList<>();


    public Recipe(String name, List<String> ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public void addRecipe(Recipe recipe) {
        recipes.add(recipe);
    }

    public boolean hasIngredient(String ingredientParam) {
        boolean isIngredient = false;
        for (String ingredient : ingredients) {
            if (ingredient.equals(ingredientParam)) {
                isIngredient = true;
                break;
            }
        }
        return isIngredient;
    }
}




package morecosmetics.paper.Items;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

public class Items {

    public static Integer AmountOfItems = 6;

    public static ItemStack Headphones;

    public static ItemStack Antlers;

    public static ItemStack BunnyEars;

    public static ItemStack CrookedTopHat;

    public static ItemStack Fedora;

    public static ItemStack AstronautHelmet;

    public static void MakeItems() {
        createAntlers();
        createBunnyEars();
        createHeadphones();
        createCrookedTopHat();
        createFedora();
        createAstronautHelmet();
    }

    private static void createHeadphones() {
        ItemStack item = new ItemStack(Material.CARVED_PUMPKIN, 1);
        ItemMeta meta = item.getItemMeta();
        item.setItemMeta(meta);
        meta.setCustomModelData(Integer.valueOf(1));
        meta.setDisplayName("Headphones");
        item.setItemMeta(meta);
        Headphones = item;
        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("a-z0-9/._-"), Headphones);
        recipe.shape(new String[] { "BBB", "R R", "   " });
        recipe.setIngredient('R', Material.RED_WOOL);
        recipe.setIngredient('B', Material.BLACK_WOOL);
        Bukkit.getServer().addRecipe((Recipe)recipe);
    }

    private static void createAntlers() {
        ItemStack item1 = new ItemStack(Material.CARVED_PUMPKIN, 1);
        ItemMeta meta1 = item1.getItemMeta();
        item1.setItemMeta(meta1);
        meta1.setCustomModelData(Integer.valueOf(2));
        meta1.setDisplayName("Antlers");
        item1.setItemMeta(meta1);
        Antlers = item1;
        ShapedRecipe recipe1 = new ShapedRecipe(NamespacedKey.minecraft("b-z0-9/._-"), Antlers);
        recipe1.shape(new String[] { "3 3", "3 3", " 3 " });
        recipe1.setIngredient('3', Material.BROWN_WOOL);
        Bukkit.getServer().addRecipe((Recipe)recipe1);
    }

    private static void createBunnyEars() {
        ItemStack item2 = new ItemStack(Material.CARVED_PUMPKIN, 1);
        ItemMeta meta2 = item2.getItemMeta();
        item2.setItemMeta(meta2);
        meta2.setCustomModelData(Integer.valueOf(3));
        meta2.setDisplayName("Bunny Ears");
        item2.setItemMeta(meta2);
        BunnyEars = item2;
        ShapedRecipe recipe2 = new ShapedRecipe(NamespacedKey.minecraft("c-z0-9/._-"), BunnyEars);
        recipe2.shape(new String[] { " w ", "wpw", "wpw" });
        recipe2.setIngredient('w', Material.WHITE_WOOL);
        recipe2.setIngredient('p', Material.PINK_WOOL);
        Bukkit.getServer().addRecipe((Recipe)recipe2);
    }

    private static void createCrookedTopHat() {
        ItemStack item3 = new ItemStack(Material.CARVED_PUMPKIN, 1);
        ItemMeta meta3 = item3.getItemMeta();
        item3.setItemMeta(meta3);
        meta3.setCustomModelData(Integer.valueOf(4));
        meta3.setDisplayName("crooked Mini TopHat");
        item3.setItemMeta(meta3);
        CrookedTopHat = item3;
        ShapedRecipe recipe3 = new ShapedRecipe(NamespacedKey.minecraft("d-z0-9/._-"), CrookedTopHat);
        recipe3.shape(new String[] { "   ", " R ", " B " });
        recipe3.setIngredient('B', Material.BLACK_WOOL);
        recipe3.setIngredient('R', Material.RED_WOOL);
        Bukkit.getServer().addRecipe((Recipe)recipe3);
    }

    private static void createFedora()
    {
        ItemStack item4 = new ItemStack(Material.CARVED_PUMPKIN, 1);
        ItemMeta meta4 = item4.getItemMeta();
        item4.setItemMeta(meta4);
        meta4.setCustomModelData(Integer.valueOf(5));
        meta4.setDisplayName("Fedora");
        item4.setItemMeta(meta4);
        Fedora = item4;
        ShapedRecipe recipe4 = new ShapedRecipe(NamespacedKey.minecraft("e-z0-9/._-"), Fedora);
        recipe4.shape(new String[] { "   ", " G ", "BGB" });
        recipe4.setIngredient('B', Material.BLACK_WOOL);
        recipe4.setIngredient('G', Material.GRAY_WOOL);
        Bukkit.getServer().addRecipe((Recipe)recipe4);
    }

    private static void createAstronautHelmet()
    {
        ItemStack item5 = new ItemStack(Material.CARVED_PUMPKIN, 1);
        ItemMeta meta5 = item5.getItemMeta();
        item5.setItemMeta(meta5);
        meta5.setCustomModelData(Integer.valueOf(7));
        meta5.setDisplayName("Astronaut Helmet");
        item5.setItemMeta(meta5);
        AstronautHelmet = item5;
        ShapedRecipe recipe5 = new ShapedRecipe(NamespacedKey.minecraft("f-z0-9/._-"), AstronautHelmet);
        recipe5.shape(new String[] { "WWW", "WLW", "WWW" });
        recipe5.setIngredient('W', Material.WHITE_WOOL);
        recipe5.setIngredient('L', Material.LIGHT_BLUE_WOOL);
        Bukkit.getServer().addRecipe((Recipe)recipe5);
    }

}
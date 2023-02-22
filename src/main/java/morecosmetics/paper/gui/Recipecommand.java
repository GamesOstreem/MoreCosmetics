package morecosmetics.paper.gui;

import morecosmetics.paper.Items.Items;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.HashMap;

public class Recipecommand implements CommandExecutor {
    public static Inventory GUI;

    public static HashMap<Player, Integer> playerinv = new HashMap<Player, Integer>();

    public static ItemStack red_wool = new ItemStack(Material.RED_WOOL);
    public static ItemStack orange_wool = new ItemStack(Material.ORANGE_WOOL);
    public static ItemStack yellow_wool = new ItemStack(Material.YELLOW_WOOL);
    public static ItemStack lime_wool = new ItemStack(Material.LIME_WOOL);
    public static ItemStack green_wool = new ItemStack(Material.GREEN_WOOL);
    public static ItemStack blue_wool = new ItemStack(Material.BLUE_WOOL);
    public static ItemStack light_blue_wool = new ItemStack(Material.LIGHT_BLUE_WOOL);
    public static ItemStack purple_wool = new ItemStack(Material.PURPLE_WOOL);
    public static ItemStack pink_wool = new ItemStack(Material.PINK_WOOL);
    public static ItemStack white_wool = new ItemStack(Material.WHITE_WOOL);
    public static ItemStack light_gray_wool = new ItemStack(Material.LIGHT_GRAY_WOOL);
    public static ItemStack gray_wool = new ItemStack(Material.GRAY_WOOL);
    public static ItemStack black_wool = new ItemStack(Material.BLACK_WOOL);
    public static ItemStack brown_wool = new ItemStack(Material.BROWN_WOOL);

    public static ItemStack Gray_glass = new ItemStack(Material.GRAY_STAINED_GLASS_PANE);
    public static ItemStack black_glass = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);

    public static ItemStack forward = new ItemStack(Material.ARROW);
    public static ItemStack back = new ItemStack(Material.FEATHER);
    public static ItemStack Close = new ItemStack(Material.BARRIER);

    public static ItemMeta backMeta = back.getItemMeta();
    public static ItemMeta gray_glassMeta = Gray_glass.getItemMeta();
    public static ItemMeta black_glassItemMeta = black_glass.getItemMeta();
    public static ItemMeta forwardMeta = forward.getItemMeta();
    public static ItemMeta CloseMeta = Close.getItemMeta();

    public boolean onCommand(CommandSender commandSender, Command command, String label, String[] args) {
        if (commandSender instanceof Player) {
            Player player = (Player)commandSender;

            Inventory inv = creategui(player,"How to craft antlers",Items.Antlers);

            inv.setItem(10, brown_wool);
            inv.setItem(12, brown_wool);
            inv.setItem(19, brown_wool);
            inv.setItem(21, brown_wool);
            inv.setItem(29, brown_wool);
            player.openInventory(inv);

            playerinv.put(player, 1);
        }
        return false;
    }

    public static Inventory creategui(Player player, String string,ItemStack item)
    {
        Inventory inv = Bukkit.createInventory((InventoryHolder)player, 45, ChatColor.BLACK.toString() + ChatColor.BOLD + string);

        black_glassItemMeta.setDisplayName(" ");
        black_glass.setItemMeta(black_glassItemMeta);
        gray_glassMeta.setDisplayName("");
        Gray_glass.setItemMeta(gray_glassMeta);
        forwardMeta.setDisplayName(ChatColor.GREEN.toString() + ChatColor.BOLD + "Forward");
        forward.setItemMeta(forwardMeta);
        backMeta.setDisplayName(ChatColor.RED.toString() + ChatColor.BOLD + "Back");
        back.setItemMeta(backMeta);
        CloseMeta.setDisplayName(ChatColor.RED.toString() + ChatColor.BOLD + "Close");
        Close.setItemMeta(CloseMeta);

        for (int i : new int[] {
                1, 2, 3, 4, 5, 6, 7, 8, 9, 13,
                14, 15, 16, 17, 18, 22, 24, 25, 26, 27,
                31, 32, 33, 34, 35, 36, 37, 38, 40, 42,
                43, 44 })
            inv.setItem(i, black_glass);

            inv.setItem(0, Close);
            inv.setItem(23, item);
            inv.setItem(39, back);
            inv.setItem(41, forward);

        return inv;
    }

}
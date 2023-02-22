package morecosmetics.paper.gui;

import morecosmetics.paper.Items.Items;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

public class recipesListener extends Recipecommand implements Listener {

    public static Inventory CreateHeadphonesGUI(Player player) {
        Inventory inv = creategui(player, "How to craft Headphones", Items.Headphones);

        inv.setItem(10, black_wool);
        inv.setItem(11, black_wool);
        inv.setItem(12, black_wool);
        inv.setItem(19, red_wool);
        inv.setItem(21, red_wool);
        return inv;
    }

    public static Inventory CreateBunnyEarsGUI(Player player) {
        Inventory inv = creategui(player, "How to craft bunny-ears", Items.BunnyEars);

        inv.setItem(11, white_wool);
        inv.setItem(19, white_wool);
        inv.setItem(21, white_wool);
        inv.setItem(28, white_wool);
        inv.setItem(30, white_wool);
        inv.setItem(20, pink_wool);
        inv.setItem(29, pink_wool);
        return inv;
    }

    public static Inventory CreateAntlersGUI(Player player) {
        Inventory inv = creategui(player, "How to craft antlers", Items.Antlers);

        inv.setItem(10, brown_wool);
        inv.setItem(12, brown_wool);
        inv.setItem(19, brown_wool);
        inv.setItem(21, brown_wool);
        inv.setItem(29, brown_wool);

        return inv;
    }

    public static Inventory CreateMiniTopHatGUI(Player player) {
        Inventory inv = creategui(player, "How to craft a mini top hat", Items.CrookedTopHat);

        inv.setItem(20, red_wool);
        inv.setItem(29, black_wool);
        return inv;
    }

    public static Inventory CreateFedoraGUI(Player player) {
        Inventory inv = creategui(player, "How to craft a fedora", Items.Fedora);

        inv.setItem(28, black_wool);
        inv.setItem(30, black_wool);
        inv.setItem(20, gray_wool);
        inv.setItem(29, gray_wool);
        return inv;
    }

    public static Inventory CreateAstronautHelmetGUI(Player player) {
        Inventory inv = creategui(player, "How to craft a astronaut helmet", Items.AstronautHelmet);

        inv.setItem(10, white_wool);
        inv.setItem(11, white_wool);
        inv.setItem(12, white_wool);
        inv.setItem(19, white_wool);
        inv.setItem(21, white_wool);
        inv.setItem(28, white_wool);
        inv.setItem(29, white_wool);
        inv.setItem(30, white_wool);
        inv.setItem(20, light_blue_wool);
        return inv;
    }

    public static void OpenGUI(int gui, Player player) {
        Inventory inv;
        switch (gui) {
            case 1:
                inv = CreateAntlersGUI(player);
                break;
            case 2:
                inv = CreateBunnyEarsGUI(player);
                break;
            case 3:
                inv = CreateHeadphonesGUI(player);
                break;
            case 4:
                inv = CreateMiniTopHatGUI(player);
                break;
            case 5:
                inv = CreateFedoraGUI(player);
                break;
            case 6:
                inv = CreateAstronautHelmetGUI(player);
                break;
            default:
                inv = null;
        }
        if (inv != null) {
            player.openInventory(inv);
        }
    }


    @EventHandler
    public void onClick(InventoryClickEvent e) {
        Player player = (Player) e.getWhoClicked();
        Integer PlayerGuiInt = playerinv.get(player);
        if (PlayerGuiInt != null) {
            Integer nextint;

            if (e.getCurrentItem() != null) {
                OpenGUI(PlayerGuiInt, player);
            }

            switch (e.getRawSlot()) {
                case 0:
                    player.closeInventory();
                    playerinv.remove(player);
                    break;
                case 41:
                    if (PlayerGuiInt != Items.AmountOfItems) {
                        nextint = PlayerGuiInt + 1;
                    } else {
                        nextint = 1;
                    }
                    playerinv.replace(player, PlayerGuiInt, nextint);
                    OpenGUI(nextint, player);

                    break;
                case 39:
                    if (PlayerGuiInt != 1) {
                        nextint = PlayerGuiInt - 1;
                        playerinv.replace(player, PlayerGuiInt, nextint);
                        OpenGUI(nextint, player);
                    } else {
                        nextint = Items.AmountOfItems;
                        playerinv.replace(player, PlayerGuiInt, nextint);
                        OpenGUI(nextint, player);
                    }
                    break;
            }
        }
    }
}
package me.wadamka.kit;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class adminkit implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        if(sender instanceof Player){
            Player p = (Player) sender;
            Inventory inv = p.getInventory();

            if(p.hasPermission("adminkit")){

                ItemStack nsw = new ItemStack(Material.NETHERITE_SWORD);
                nsw.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 6);

                ItemStack kbs = new ItemStack(Material.STICK);
                kbs.addUnsafeEnchantment(Enchantment.KNOCKBACK, 1);

                ItemStack nbs = new ItemStack(Material.NETHERITE_BOOTS);
                ItemStack nbl = new ItemStack(Material.NETHERITE_LEGGINGS);
                ItemStack nbc = new ItemStack(Material.NETHERITE_CHESTPLATE);
                ItemStack nbh = new ItemStack(Material.NETHERITE_HELMET);
                nbs.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 6);
                nbl.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 6);
                nbc.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 6);
                nbh.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 6);



                inv.addItem(nsw, kbs, nbs, nbl, nbc, nbh);



            }


        }

        return true;
    }
}

package me.wadamka.kit;

import org.bukkit.plugin.java.JavaPlugin;

public final class Kit extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        this.getCommand("adminkit").setExecutor(new adminkit());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

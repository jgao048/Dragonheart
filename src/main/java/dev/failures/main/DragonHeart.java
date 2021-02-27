package dev.failures.main;

import org.bukkit.plugin.java.JavaPlugin;

public final class DragonHeart extends JavaPlugin {
    private static DragonHeart instance;

    @Override
    public void onEnable() {
        instance = this;
        // Plugin startup logic
    }

    public static DragonHeart getInstance() {
        return instance;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

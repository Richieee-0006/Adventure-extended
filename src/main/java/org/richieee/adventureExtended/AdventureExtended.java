package org.richieee.adventureExtended;

import org.bukkit.plugin.java.JavaPlugin;

public final class AdventureExtended extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("Adventure Extended enabled.");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Adventure Extended disabled.");
    }
}

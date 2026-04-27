package com.pluginforge.spicyop;

import org.bukkit.plugin.java.JavaPlugin;

public final class SpicyOpPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("SpicyOp v1.0 enabled.");
        getCommand("opp").setExecutor(new OppCommand());

    }

    @Override
    public void onDisable() {
        getLogger().info("SpicyOp disabled.");
    }
}

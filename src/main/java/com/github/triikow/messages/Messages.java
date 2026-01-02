package com.github.triikow.messages;

import com.github.triikow.messages.listener.PlayerJoinListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Messages extends JavaPlugin {

    @Override
    public void onEnable() {
        if (getServer().getPluginManager().isPluginEnabled("PlaceholderAPI")) {
            getServer().getPluginManager().registerEvents(new PlayerJoinListener(), this);
        }
        else {
            getLogger().warning("Could not find PlaceholderAPI. This plugin is required.");
            getServer().getPluginManager().disablePlugin(this);
        }
    }

}

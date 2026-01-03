package com.github.triikow.messages;

import com.github.triikow.messages.listener.PlayerJoinListener;
import com.github.triikow.messages.listener.PlayerQuitListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Messages extends JavaPlugin {

    @Override
    public void onEnable() {
        if (getServer().getPluginManager().isPluginEnabled("PlaceholderAPI")) {
            saveDefaultConfig();
            getServer().getPluginManager().registerEvents(new PlayerJoinListener(this), this);
            getServer().getPluginManager().registerEvents(new PlayerQuitListener(this), this);
        }
        else {
            getLogger().warning("Could not find PlaceholderAPI. This plugin is required.");
            getServer().getPluginManager().disablePlugin(this);
        }
    }

}

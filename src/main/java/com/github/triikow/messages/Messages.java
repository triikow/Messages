package com.github.triikow.messages;

import com.github.triikow.messages.listener.PlayerJoinListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Messages extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new PlayerJoinListener(), this);
    }

}

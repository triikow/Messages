package com.github.triikow.messages.listener;

import com.github.triikow.messages.Messages;
import me.clip.placeholderapi.PlaceholderAPI;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import static com.github.triikow.messages.util.Components.mm;


public class PlayerJoinListener implements Listener {

    private final Messages plugin;

    public PlayerJoinListener(Messages plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        String joinMessage;
        if (event.getPlayer().hasPlayedBefore()) {
            joinMessage = plugin.getConfig().getString("join-quit.join-message");
        }
        else {
            joinMessage = plugin.getConfig().getString("join-quit.first-join-message");
        }

        if (joinMessage != null) {
            joinMessage = PlaceholderAPI.setPlaceholders(event.getPlayer(), joinMessage);
            event.joinMessage(mm(joinMessage));
        }
    }
}

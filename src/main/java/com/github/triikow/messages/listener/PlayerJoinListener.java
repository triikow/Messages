package com.github.triikow.messages.listener;

import me.clip.placeholderapi.PlaceholderAPI;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import static com.github.triikow.messages.util.Components.mm;


public class PlayerJoinListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        String joinMessage = "<b><aqua>%player_name%</aqua></b> <yellow>joined the server!";
        joinMessage = PlaceholderAPI.setPlaceholders(event.getPlayer(), joinMessage);
        event.joinMessage(mm(joinMessage));
    }
}

package com.github.triikow.messages.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import static com.github.triikow.messages.util.Components.mm;


public class PlayerJoinListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        final Player player = event.getPlayer();

        event.joinMessage(mm("<b><aqua>" + player.getName() + "</aqua></b> <yellow>joined the server!</yellow>"));
    }
}

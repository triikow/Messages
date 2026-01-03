package com.github.triikow.messages.listener;

import com.github.triikow.messages.Messages;
import me.clip.placeholderapi.PlaceholderAPI;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import static com.github.triikow.messages.util.Components.mm;

public class PlayerQuitListener implements Listener {
    private final Messages plugin;

    public PlayerQuitListener(Messages plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        String quitMessage = plugin.getConfig().getString("join-quit.quit-message");

        if (quitMessage != null) {
            quitMessage = PlaceholderAPI.setPlaceholders(event.getPlayer(), quitMessage);
            event.quitMessage(mm(quitMessage));
        }
    }
}

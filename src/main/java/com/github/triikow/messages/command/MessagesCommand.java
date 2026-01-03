package com.github.triikow.messages.command;

import com.github.triikow.messages.Messages;
import com.mojang.brigadier.Command;
import com.mojang.brigadier.tree.LiteralCommandNode;
import io.papermc.paper.command.brigadier.CommandSourceStack;
import io.papermc.paper.command.brigadier.Commands;
import org.bukkit.command.CommandSender;
import org.jspecify.annotations.NullMarked;

@NullMarked
public class MessagesCommand {
    private final Messages plugin;

    public MessagesCommand(Messages plugin) {
        this.plugin = plugin;
    }

    public LiteralCommandNode<CommandSourceStack> build() {
        return Commands.literal(this.plugin.getName().toLowerCase())
                .then(Commands.literal("reload")
                        .executes(ctx -> {
                            final CommandSender sender = ctx.getSource().getSender();
                            plugin.reloadConfig();
                            sender.sendRichMessage("<yellow>Messages config reloaded.</yellow>");
                            return Command.SINGLE_SUCCESS;
                        }))
                .build();
    }
}

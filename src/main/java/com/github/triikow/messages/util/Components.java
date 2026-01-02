package com.github.triikow.messages.util;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;

public final class Components {

    public static Component mm(String miniMessageString) {
        return MiniMessage.miniMessage().deserialize(miniMessageString);
    }

}

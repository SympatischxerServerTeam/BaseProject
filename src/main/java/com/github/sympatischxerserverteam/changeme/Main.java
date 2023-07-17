package com.github.sympatischxerserverteam.changeme;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.java.JavaPluginLoader;
import org.jetbrains.annotations.NotNull;

import java.io.File;

public class Main extends JavaPlugin {

    public static Main plugin;

    public Main() {
        super();
    }

    protected Main(JavaPluginLoader loader, PluginDescriptionFile description, File dataFolder, File file) {
        super(loader, description, dataFolder, file);
    }

    @Override
    public void onEnable() {
        plugin = this;
        Bukkit.getConsoleSender().sendMessage(Component.text("Hello World!", NamedTextColor.GREEN));
    }

    @Override
    public void onDisable() {
        plugin = null;
        Bukkit.getConsoleSender().sendMessage(Component.text("Goodbye!", NamedTextColor.GREEN));
    }
}

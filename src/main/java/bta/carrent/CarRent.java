package bta.carrent;

import bta.carrent.commands.CreateCommand;
import bta.carrent.eingabeKlassen.Eingabe;
import bta.carrent.listener.Events;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;
import java.util.UUID;

public class CarRent extends JavaPlugin {

    public static String pluginName = "[CarRent] ";

    private HashMap<UUID, Eingabe> map = new HashMap<>();

    public HashMap<UUID, Eingabe> getMap() {
        return map;
    }


    @Override
    public void onEnable() {
        getLogger().info("Plugin wurde aktiviert.");
        getCommand("create").setExecutor(new CreateCommand());
        Bukkit.getPluginManager().registerEvents(new Events(), this);
    }

}

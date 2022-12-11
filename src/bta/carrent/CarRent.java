package bta.carrent;

import bta.carrent.eingabeKlassen.EingabeKlasse;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;
import java.util.UUID;

public class CarRent extends JavaPlugin {

    public static String pluginName = "[CarRent] ";

    private HashMap<UUID, EingabeKlasse> map = new HashMap<>();

    public HashMap<UUID, EingabeKlasse> getMap() {
        return map;
    }

    @Override
    public void onEnable() {
        getLogger().info("Plugin wurde aktiviert.");
    }
}

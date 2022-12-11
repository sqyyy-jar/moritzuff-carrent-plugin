package bta.carrent;

import bta.carrent.eingabeKlassen.EingabeKlasse;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;
import java.util.UUID;
import java.util.logging.Logger;

public class CarRent extends JavaPlugin {

    public static String pluginName = "[CarRent] ";
    public Logger logger = getLogger();

    private HashMap<UUID, EingabeKlasse> map = new HashMap<>();

    public HashMap<UUID, EingabeKlasse> getMap() {
        return map;
    }

    public void setMap(HashMap<UUID, EingabeKlasse> map) {
        this.map = map;
    }

    @Override
    public void onEnable() {
        logger.info("Plugin wurde aktiviert.");
    }
}

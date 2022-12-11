package bta.carrent;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class CarRent extends JavaPlugin {

    public static String pluginName = "[CarRent] ";
    public Logger logger = getLogger();

    @Override
    public void onEnable() {
        logger.info("Plugin wurde aktiviert.");
    }
}

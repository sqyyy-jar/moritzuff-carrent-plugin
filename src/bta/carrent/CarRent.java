package bta.carrent;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.plugin.java.JavaPlugin;

public class CarRent extends JavaPlugin {

    public static String pluginName = "[CarRent] ";

    @Override
    public void onEnable() {
        System.out.println(pluginName + "wurde erfolgreich gestartet.");
    }
}

package bta.carrent.commands;

import bta.carrent.CarRent;
import bta.carrent.eingabeKlassen.EingabeKlasse;
import bta.carrent.eingabeKlassen.PkwEingabe;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.UUID;

public class CreateCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            HashMap<UUID, EingabeKlasse> map = CarRent.getPlugin(CarRent.class).getMap();
            Player player = (Player) sender;
            UUID uuid = player.getUniqueId();
            if (args.length != 1) {
                player.sendMessage(CarRent.pluginName + "Syntax: /create PKW; LKW");
            } else if (args[0].equalsIgnoreCase("pkw")) {
                map.put(uuid, new PkwEingabe());
                player.sendMessage(CarRent.pluginName + "Geben Sie bitte den Namen des PKWs ein.");
            } else if (args[0].equalsIgnoreCase("lkw")) {
            } else if (args[0].equalsIgnoreCase("kunde")) {
            } else if (args[0].equals("mitarbeiter")) {
            }
        }
        return true;
    }
}

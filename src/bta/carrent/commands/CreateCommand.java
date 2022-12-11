package bta.carrent.commands;

import bta.carrent.CarRent;
import bta.carrent.eingabeKlassen.EingabeKlasse;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.UUID;

public class CreateCommand implements CommandExecutor {

    HashMap map = new CarRent().getMap();

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            UUID uuid = player.getUniqueId();
            map.put(uuid, new EingabeKlasse());

            if (args.length != 1) {
                player.sendMessage(CarRent.pluginName + "Syntax: /create PKW; LKW");

            } else if (args[0].equalsIgnoreCase("pkw")) {
                player.sendMessage(CarRent.pluginName + "Geben Sie bitte den Namen des PKWs ein.");


            } else if (args[0].equalsIgnoreCase("lkw")) {

            } else if (args[0].equalsIgnoreCase("kunde")) {

            } else if (args[0].equals("mitarbeiter")) {

            }

        }

        return true;
    }
}

package bta.carrent.commands;

import bta.carrent.CarRent;
import bta.carrent.fahrzeuge.Pkw;
import bta.carrent.listeners.ChatListener;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.player.AsyncPlayerChatEvent;
F
public class CreateCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;

            if (args.length > 0) {
                player.sendMessage(CarRent.pluginName + "Syntax: /create PKW; LKW; KUNDE; MITARBEITER");

            } else if (args[0].equalsIgnoreCase("pkw")) {
                

            } else if (args[0].equalsIgnoreCase("lkw")) {

            } else if (args[0].equalsIgnoreCase("kunde")) {

            } else if (args[0].equals("mitarbeiter")) {

            }

        }


        return true;
    }
}

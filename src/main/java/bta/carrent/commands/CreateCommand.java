package bta.carrent.commands;

import bta.carrent.CarRent;
import bta.carrent.eingabeKlassen.Eingabe;
import bta.carrent.eingabeKlassen.LkwEingabe;
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
            HashMap<UUID, Eingabe> map = CarRent.getPlugin(CarRent.class).getMap();
            Player player = (Player) sender;
            UUID uuid = player.getUniqueId();

            if (args.length != 1) {
                player.sendMessage(CarRent.pluginName + "Syntax: /create PKW; LKW");
                return true;
            }

            switch (args[0].toLowerCase()) {
                case "pkw":
                    map.put(uuid, new PkwEingabe());
                    player.sendMessage(CarRent.pluginName + "Geben Sie bitte den Namen des PKWs ein.");
                    break;
                case "lkw":
                    map.put(uuid, new LkwEingabe());
                    player.sendMessage(CarRent.pluginName + "Geben Sie bitte den Namen des LKWs ein.");
                    break;
                case "kunde":
                    break;
                case "mitarbeiter":
                    break;
                default:
                    player.sendMessage(CarRent.pluginName + "Syntax: /create XY");
                    break;
            }
        }
        return true;
    }
}

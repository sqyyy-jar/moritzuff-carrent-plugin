package bta.carrent.listener;

import bta.carrent.CarRent;
import bta.carrent.eingabeKlassen.Eingabe;
import bta.carrent.fahrzeuge.Pkw;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import java.util.HashMap;
import java.util.UUID;

public class Events implements Listener {

    //Chat Event
    @EventHandler
    public void onChat(AsyncPlayerChatEvent event) {
        HashMap<UUID, Eingabe> map = CarRent.getPlugin(CarRent.class).getMap();
        Eingabe eingabe = map.get(event.getPlayer().getUniqueId());
        if (eingabe == null) {
            return;
        }
        event.setCancelled(true);
        eingabe.onChat(event.getPlayer(), event.getMessage());
        if (eingabe.isDone()) {
            map.remove(event.getPlayer().getUniqueId());
        }

    }
}

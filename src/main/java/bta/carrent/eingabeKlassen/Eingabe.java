package bta.carrent.eingabeKlassen;

import org.bukkit.entity.Player;

public abstract class Eingabe {

    public abstract void onChat(Player player, String message);

    public abstract boolean isDone();

}
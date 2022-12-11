package bta.carrent.eingabeKlassen;

import org.bukkit.entity.Player;

public class LkwEingabe extends Eingabe {

    private int status = 0;
    private String name;
    private double laderaum;
    private double nutzlast;
    private double kmPreis;
    private int freieKmProTag;
    private String fuehrerscheinAnforderung;

    @Override
    public void onChat(Player player, String message) {
        player.sendMessage(message);
        switch (status) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
        }
    }

    @Override
    public boolean isDone() {
        return false;
    }
}

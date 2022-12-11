package bta.carrent.eingabeKlassen;

import bta.carrent.fahrzeuge.Pkw;
import org.bukkit.entity.Player;

public class PkwEingabe extends Eingabe {

    private int status = 0;
    private boolean done = false;
    private String name;
    private int grundtarif;
    private boolean verfuegbarkeit;
    private int tuerenanzahl;
    private String getriebe;

    @Override
    public void onChat(Player player, String message) {
        player.sendMessage(message);
        switch (status) {
            case 0 -> {
                name = message;
                player.sendMessage("Bitte gebe jetzt den Grundtarif ein.");
            }
            case 1 -> {
                grundtarif = Integer.parseInt(message);
                player.sendMessage("Bitte gebe jetzt die Verfügbarkeit ein.");
            }
            case 2 -> {
                verfuegbarkeit = Boolean.parseBoolean(message);
                player.sendMessage("Bitte gebe jetzt die Türenanzahl ein.");
            }
            case 3 -> {
                tuerenanzahl = Integer.parseInt(message);
                player.sendMessage("Bitte gebe jetzt das Getriebe ein.");
            }
            case 4 -> {
                getriebe = message;
                done = true;
                Pkw pkw = new Pkw(name, grundtarif, verfuegbarkeit, tuerenanzahl, getriebe);
                player.sendMessage(pkw.toString());
            }
        }
        status++;
    }

    @Override
    public boolean isDone() {
        return done;
    }

    public String getName() {
        return name;
    }

    public int getGrundtarif() {
        return grundtarif;
    }

    public boolean isVerfuegbarkeit() {
        return verfuegbarkeit;
    }

    public int getTuerenanzahl() {
        return tuerenanzahl;
    }

    public String getGetriebe() {
        return getriebe;
    }

}

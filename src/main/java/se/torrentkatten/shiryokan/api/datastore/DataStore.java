package se.torrentkatten.shiryokan.api.datastore;

import se.torrentkatten.shiryokan.api.model.Game;
import se.torrentkatten.shiryokan.api.model.GameConsole;
import se.torrentkatten.shiryokan.api.model.Region;

import java.util.ArrayList;
import java.util.List;

public class DataStore {
    private static List<GameConsole> consoles = new ArrayList<>();

    static {
        consoles.add(GameConsole.builder()
                .withName("NintendoSwitch")
                .withRegion(Region.EU)
                .withGames(Game.builder()
                        .withName("Diablo III: Eternal Collection")
                        .withRegion(Region.EU).build())
                .build()
        );
    }

    public static List<GameConsole> findAllGameConsoles(){
        return List.copyOf(consoles);
    }
}
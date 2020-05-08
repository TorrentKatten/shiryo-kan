package se.torrentkatten.shiryokan.api.datastore;

import se.torrentkatten.shiryokan.api.model.Game;
import se.torrentkatten.shiryokan.api.model.GameConsole;
import se.torrentkatten.shiryokan.api.model.Region;

import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.List;

@Singleton
public class DataStore {

    private static List<GameConsole> consoles;

    public DataStore() {
        consoles = new ArrayList<>();
        consoles.add(GameConsole.builder()
                .withName("NintendoSwitch")
                .withRegion(Region.EU)
                .withGames(Game.builder()
                        .withName("Diablo III: Eternal Collection")
                        .withRegion(Region.EU).build())
                .build()
        );
    }

    public List<GameConsole> findAllGameConsoles() {
        return List.copyOf(consoles);
    }
}
package se.torrentkatten.shiryokan.datastore;

import se.torrentkatten.shiryokan.datastore.model.Game;
import se.torrentkatten.shiryokan.datastore.model.GameConsole;
import se.torrentkatten.shiryokan.datastore.model.Region;

import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.List;

@Singleton
public class DataStore {

    private static List<GameConsole> consoles;

    public DataStore() {
        consoles = new ArrayList<>();
        consoles.add(GameConsole.builder()
                .withName("Nintendo Switch")
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

    public GameConsole createGameConsole(GameConsole gameConsole) {
        consoles.add(gameConsole);
        return consoles.stream().filter(c->c.getUuid().equals(gameConsole.getUuid())).findFirst().get();
    }
}
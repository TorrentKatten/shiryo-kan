package se.torrentkatten.shiryokan.datastore.model;

import java.util.UUID;

public interface GameConsoleBuilder {

    GameConsoleBuilder withUuid(UUID uuid);

    GameConsoleBuilder withName(String name);

    GameConsoleBuilder withGames(Game... games);

    GameConsoleBuilder withRegion(Region region);

    GameConsole build();
}
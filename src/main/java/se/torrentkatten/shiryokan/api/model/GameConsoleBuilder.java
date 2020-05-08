package se.torrentkatten.shiryokan.api.model;

public interface GameConsoleBuilder {
    GameConsoleBuilder withName(String name);

    GameConsoleBuilder withGames(Game... games);

    GameConsoleBuilder withRegion(Region region);

    GameConsole build();
}
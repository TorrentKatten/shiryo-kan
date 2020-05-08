package se.torrentkatten.shiryokan.api.model;

import com.google.common.collect.ImmutableList;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public final class GameConsole {

    private final UUID uuid;
    private final String name;
    private final List<Game> games;
    private final Region region;

    private GameConsole(UUID uuid, String name, List<Game> games, Region region) {
        this.uuid = uuid;
        this.name = name;
        this.games = ImmutableList.copyOf(games);
        this.region = region;
    }

    public static GameConsoleBuilder builder() {
        return new GameConsole.Builder();
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public List<Game> getGames() {
        return games;
    }

    public Region getRegion() {
        return region;
    }

    private static class Builder implements GameConsoleBuilder {
        private UUID uuid = UUID.randomUUID();
        private String name;
        private List<Game> games;
        private Region region;

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withGames(Game... games) {
            this.games = Arrays.asList(games);
            return this;
        }

        public Builder withRegion(Region region) {
            this.region = region;
            return this;
        }

        public GameConsole build() {
            return new GameConsole(uuid, name, games, region);
        }
    }
}

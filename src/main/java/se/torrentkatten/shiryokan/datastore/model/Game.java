package se.torrentkatten.shiryokan.datastore.model;

import java.util.UUID;

public class Game {

    private final UUID uuid;
    private final String name;
    private final Region region;

    private Game(UUID uuid, String name, Region region) {
        this.uuid = uuid;
        this.name = name;
        this.region = region;
    }

    public static GameBuilder builder() {
        return new Game.Builder();
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public Region getRegion() {
        return region;
    }

    private static class Builder implements GameBuilder {
        private UUID uuid = UUID.randomUUID();
        private String name;
        private Region region;

        public Game.Builder withUuid(UUID uuid) {
            this.uuid = uuid;
            return this;
        }

        public Game.Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Game.Builder withRegion(Region region) {
            this.region = region;
            return this;
        }

        public Game build() {
            return new Game(uuid, name, region);
        }
    }
}

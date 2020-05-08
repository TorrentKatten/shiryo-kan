package se.torrentkatten.shiryokan.api.model;

import se.torrentkatten.shiryokan.datastore.model.Game;
import se.torrentkatten.shiryokan.datastore.model.Region;

import java.util.UUID;

public class GameDTO {

    private UUID uuid;
    private String name;
    private String region;

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Game to() {
        return Game.builder()
                .withUuid(uuid)
                .withName(name)
                .withRegion(Region.valueOf(region))
                .build();
    }

    public static GameDTO from(Game game) {
        GameDTO gameDTO = new GameDTO();
        gameDTO.setUuid(game.getUuid());
        gameDTO.setName(game.getName());
        gameDTO.setRegion(game.getRegion().name());
        return gameDTO;
    }
}

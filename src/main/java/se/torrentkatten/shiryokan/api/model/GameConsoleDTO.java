package se.torrentkatten.shiryokan.api.model;

import se.torrentkatten.shiryokan.datastore.model.Game;
import se.torrentkatten.shiryokan.datastore.model.GameConsole;
import se.torrentkatten.shiryokan.datastore.model.Region;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public final class GameConsoleDTO {
    private UUID uuid;
    private String name;
    private List<GameDTO> games;
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

    public List<GameDTO> getGames() {
        return games;
    }

    public void setGames(List<GameDTO> games) {
        this.games = games;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }


    public GameConsole to() {
        return GameConsole.builder()
                .withName(name)
                .withUuid(uuid)
                .withRegion(Region.valueOf(region))
                .withGames(games.stream().map(game -> game.to()).collect(Collectors.toList()).toArray(Game[]::new))
                .build();
    }

    public static GameConsoleDTO from(GameConsole gameConsole) {
        GameConsoleDTO gameConsoleDTO = new GameConsoleDTO();
        gameConsoleDTO.setUuid(gameConsole.getUuid());
        gameConsoleDTO.setName(gameConsole.getName());
        gameConsoleDTO.setRegion(gameConsole.getRegion().name());
        gameConsoleDTO.setGames(gameConsole.getGames().stream().map(GameDTO::from).collect(Collectors.toList()));
        return gameConsoleDTO;
    }
}

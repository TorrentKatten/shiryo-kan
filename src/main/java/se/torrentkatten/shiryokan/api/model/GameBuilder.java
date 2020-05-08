package se.torrentkatten.shiryokan.api.model;

public interface GameBuilder {
    GameBuilder withName(String name);

    GameBuilder withRegion(Region region);

    Game build();
}

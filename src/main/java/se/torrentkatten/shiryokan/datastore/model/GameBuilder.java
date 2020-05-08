package se.torrentkatten.shiryokan.datastore.model;

import java.util.UUID;

public interface GameBuilder {

    GameBuilder withUuid(UUID uuid);

    GameBuilder withName(String name);

    GameBuilder withRegion(Region region);

    Game build();
}

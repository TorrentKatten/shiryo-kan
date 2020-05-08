package se.torrentkatten.shiryokan.api;

import se.torrentkatten.shiryokan.api.model.GameConsoleDTO;
import se.torrentkatten.shiryokan.datastore.DataStore;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.UUID;

@Path("/consoles/")
public class GameConsoles {

    @Inject
    DataStore dataStore;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response findAllConsoles() {
        return Response.ok(dataStore.findAllGameConsoles()).build();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response createGameConsole(GameConsoleDTO gameConsole) {
        gameConsole.setUuid(UUID.randomUUID());
        return Response.ok(dataStore.createGameConsole(gameConsole.to())).build();
    }
}
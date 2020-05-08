package se.torrentkatten.shiryokan.api.api;

import se.torrentkatten.shiryokan.api.datastore.DataStore;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/consoles/")
public class GameConsoles {

    @Inject
    DataStore dataStore;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response findAllConsoles() {
        return Response.ok(dataStore.findAllGameConsoles()).build();
    }
}
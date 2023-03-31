package pt.winprovit;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.enums.SchemaType;

import io.quarkus.cache.CacheResult;
import pt.winprovit.exception.AlticciException;
import pt.winprovit.exception.ErrorResponseBody;
import pt.winprovit.validation.AlticciValidator;

@Path("/alticci")
public class AlticciResource {

    @CacheResult(cacheName = "alticci-cache")
    @Path("/{n}")
    @GET
    @Produces({MediaType.APPLICATION_JSON })
    @Operation(summary = "Calculate the Alticci Sequence Value")
    @APIResponse(responseCode = "200", //
      content = @Content(//
          mediaType = MediaType.APPLICATION_JSON, //
          schema = @Schema(//
              implementation = AlticciResult.class, //
              type = SchemaType.DEFAULT)))
    @APIResponse(responseCode = "412", 
        description = "Invalid parameter value, for example, negative number was used.",
        content = @Content(//
            mediaType = MediaType.APPLICATION_JSON, //
            schema = @Schema(//
                      implementation = ErrorResponseBody.class, //
                      type = SchemaType.DEFAULT)))
    public Response getAlticciInJson(int n) throws AlticciException {
        AlticciValidator.validate(n);
        return Response.ok(new AlticciResult(Alticci.a(n))).build();
    }
}
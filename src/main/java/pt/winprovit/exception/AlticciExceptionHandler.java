package pt.winprovit.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class AlticciExceptionHandler implements ExceptionMapper<AlticciException> 
{
    @Override
    public Response toResponse(AlticciException exception) {
       return Response.status(Status.PRECONDITION_FAILED).entity(new ErrorResponseBody(exception.getMessage())).build();  
    }
}
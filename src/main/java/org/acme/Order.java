@CircuitBreaker(requestVolumeThreshold = 10, failureRatio = 0.5, delay = 15000)
@Path("/products")
@RegisterRestClient
public interface ProductRestClient {
    @GET
    @Path("/{id}")
    @CircuitBreaker(requestVolumeThreshold = 10, failureRatio = 0.5, delay = 15000)
    ProductDto findById(@PathParam Long id);
}

@Path("/products")
@RegisterRestClient
public interface ProductRestClient {
    @GET
    @Path("/{id}")
    @CircuitBreaker(requestVolumeThreshold = 10, delay = 15000)
    @Retry(maxRetries = 4)
    ProductDto findById(@PathParam Long id);
}

@Path("/orders")
@RegisterRestClient
public interface OrderRestClient {
    @GET
    @Path("/{id}")
    @CircuitBreaker(requestVolumeThreshold = 10, delay = 15000)
    Optional<OrderDto> findById(@PathParam Long id);

    @GET
    @Path("/payment/{id}")
    @CircuitBreaker(requestVolumeThreshold = 10, delay = 15000)
    Optional<OrderDto> findByPaymentId(Long id);
    
    @POST
    @CircuitBreaker(requestVolumeThreshold = 10, delay = 15000)
    OrderDto save(OrderDto order);
}

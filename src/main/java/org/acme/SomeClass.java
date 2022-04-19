public class SomeClass {
    @Inject
    @RestClient
    ProductRestClient productRestClient;
    @Fallback(fallbackMethod = "fallbackFetchProduct")
    List<ProductDto> findProductsByCategory(String category){
        return productRestClient.findProductsByCategory(category);
    }
    public List<ProductDto> fallbackFetchProduct(String category) {
        return Collections.emptyList();
    }
}

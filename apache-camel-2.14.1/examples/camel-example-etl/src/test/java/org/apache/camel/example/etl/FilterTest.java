public class FilterTest extends CamelTestSupport {
 
    @EndpointInject(uri = "mock:result")
    protected MockEndpoint resultEndpoint;
 
    @Produce(uri = "direct:start")
    protected ProducerTemplate template;
 
    @Test
    public void testSendMatchingMessage() throws Exception {
        String expectedBody = "<matched/>";
 
        resultEndpoint.expectedBodiesReceived(expectedBody);
 
        template.sendBodyAndHeader(expectedBody, "foo", "bar");
 
        resultEndpoint.assertIsSatisfied();
    }
 
    @Test
    public void testSendNotMatchingMessage() throws Exception {
        resultEndpoint.expectedMessageCount(0);
 
        template.sendBodyAndHeader("<notMatched/>", "foo", "notMatchedHeaderValue");
 
        resultEndpoint.assertIsSatisfied();
    }
 
    @Override
    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            public void configure() {
                from("direct:start").filter(header("foo").isEqualTo("bar")).to("mock:result");
            }
        };
    }
}

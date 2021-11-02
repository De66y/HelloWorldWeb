import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("hello")
public class HelloWorldRecourse {

    @GET
    @Produces(MediaType.TEXT_HTML)
    public String helloOpenShift() {
        return "Hello World of OpenShift";
    }
}

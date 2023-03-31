import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.info.License;

import javax.ws.rs.core.Application;

@OpenAPIDefinition(
        info = @Info(
                title="Alticci API",
                version = "1.0.0",
                contact = @Contact(
                        name = "Alticci API Support",
                        url = "https://winprovit.pt/contact",
                        email = "comunicacao@winprovit.pt"),
                license = @License(
                        name = "MIT License",
                        url = "https://opensource.org/license/mit/"))
)
public class AlticciApiApplication extends Application {
}
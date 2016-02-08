import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GeneralController {
    @RequestMapping("/")
    public String index() {
        return "Hello, world!!!";
    }
}

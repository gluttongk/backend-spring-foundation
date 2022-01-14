package example.endpoints;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
@RequestMapping("/api/eg")
public class Endpoints {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }
}

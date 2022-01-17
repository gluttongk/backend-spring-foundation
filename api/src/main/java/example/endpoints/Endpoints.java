package example.endpoints;

import example.response.CommonResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/eg")
public class Endpoints {

    @GetMapping("/hello")
    @ResponseBody
    public ResponseEntity<CommonResponse<Map<String, String>>> hello() {
        Map<String, String> result = new HashMap<>();
        result.put("message", "Hello World!");

        return ResponseEntity.ok(CommonResponse.of(200, result));
    }
}

package example.endpoints;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import example.mybaits_plus.domain.User;
import example.mybaits_plus.mapper.UserMapper;
import example.response.CommonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/eg")
public class Endpoints {
    private final UserMapper userMapper;

    @Autowired
    public Endpoints(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @GetMapping("/hello")
    @ResponseBody
    public ResponseEntity<CommonResponse<Map<String, String>>> hello() {
        Map<String, String> result = new HashMap<>();
        result.put("message", "Hello World!");

        return ResponseEntity.ok(CommonResponse.of(200, result));
    }

    @GetMapping("/mybatis-plus/list")
    @ResponseBody
    public ResponseEntity<CommonResponse<List<User>>> listUsers() {
        List<User> users = userMapper.selectList(new QueryWrapper<>());

        return ResponseEntity.ok(CommonResponse.of(users));
    }
}

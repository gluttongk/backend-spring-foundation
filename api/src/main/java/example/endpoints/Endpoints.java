package example.endpoints;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import example.mybaits_plus.domain.User;
import example.mybaits_plus.mapper.UserMapper;
import example.redis.RedisCache;
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
    private final RedisCache redisCache;

    @Autowired
    public Endpoints(UserMapper userMapper, RedisCache redisCache) {
        this.userMapper = userMapper;
        this.redisCache = redisCache;
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

    @GetMapping("/redis/set")
    @ResponseBody
    public ResponseEntity<String> redisSet() {
        redisCache.setCacheObject("dev", "test");
        return ResponseEntity.ok("success");
    }

    @GetMapping("/redis/get")
    @ResponseBody
    public ResponseEntity<String> redisGet() {
        String result = redisCache.getCacheObject("dev");
        return ResponseEntity.ok(result);
    }
}

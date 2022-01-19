package example.mybaits_plus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import example.mybaits_plus.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {

}

import com.luruan.SpringbootDemoApplication;
import com.luruan.domain.User;
import com.luruan.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest(classes = SpringbootDemoApplication.class)
class SpringbootDemoApplicationTests {
    @Autowired
    UserMapper userMapper;
    @Test
    void contextLoads() {
        List<User> users = userMapper.selectAll();
        System.out.println(users);
    }

}
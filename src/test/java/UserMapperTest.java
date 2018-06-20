import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

//生成测试类
//Spring+JUnit4集成测试
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-config.xml"})
public class UserMapperTest {
    //注入
    @Autowired
    UserMapper userMapper;

    @Test
    public void insert() {
        User user = new User();
        user.setUser_name("郑科");
        user.setUser_password("123456");
        int i = userMapper.insert(user);
        System.out.println(i);
    }

    @Test
    public void update() {
        //先查在修改
        int user_id=2;
        User user = userMapper.selectById(user_id);
        System.out.println("修改前："+user);
        user.setUser_name("郑科0000");
        user.setUser_password("0000");
        int update = userMapper.update(user);
        System.out.println("修改后："+userMapper.selectById(user_id));
    }

    @Test
    public void delete() {
        int user_id=2;
        int i = userMapper.delete(user_id);
        System.out.println(i);
    }

    @Test
    public void selectById() {
        int user_id=1;
        User user = userMapper.selectById(user_id);
        System.out.println(user);
    }

    @Test
    public void selectAll() {
        List<User> users = userMapper.selectAll();
        for (User user :users) {
            System.out.println(user);
        }

    }
}
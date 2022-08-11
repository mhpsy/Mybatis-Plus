package top.mhpsy.a.mybatisplus;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.mhpsy.a.mybatisplus.pojo.User;
import top.mhpsy.a.mybatisplus.service.UserService;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class MybatisPlusServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void ServiceTest(){
        long count = userService.count();
        System.out.println("count = " + count);
    }

    @Test
    public void InsertMore(){
        List<User> users = new ArrayList<User>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setName("xxx"+i);
            user.setAge(30+i);
            user.setEmail("xxx"+i+"@xx.com");
            users.add(user);
        }
        boolean b = userService.saveBatch(users);
        System.out.println("b = " + b);

    }

    @Test
    public void TestDel(){
        boolean b = userService.removeById(1L);
        System.out.println("b = " + b);
    }

}

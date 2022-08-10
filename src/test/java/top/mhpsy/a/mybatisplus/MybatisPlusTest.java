package top.mhpsy.a.mybatisplus;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import top.mhpsy.a.mybatisplus.mapper.UserMapper;
import top.mhpsy.a.mybatisplus.pojo.User;

import java.util.List;

@SpringBootTest
public class MybatisPlusTest {

    @Autowired
    public UserMapper userMapper;

    @Test
    public void testSelectList(){
        List<User> users = userMapper.selectList(null);
        users.forEach(user -> System.out.println(user));
    }

    @Test
    public void TestInsert(){
        userMapper.insert(new User(null,"xx",18,"qwer@QQ.com"));
//        如果id是null的话那么就是会得到这个(雪花算法)
//        <==        Row: -2045439999, xx, 18, qwer@QQ.com
    }

    @Test
    public void TestInsert2(){
        User user = new User();
        user.setName("xx");
        user.setAge(23);
        user.setEmail("asdf@qq.com");
        int insert = userMapper.insert(user);
        System.out.println("insert = " + insert);
        System.out.println("user id = " +user.getId());
    }
    @Test
    public void testDel(){
        int i = userMapper.deleteById(1955954690L);
        System.out.println(i);
    }

    @Test
    public void testUpdate(){
        User user = new User();
        user.setId(1);
        user.setName("xx");
        int i = userMapper.updateById(user);
        System.out.println("i = " + i);
    }

}

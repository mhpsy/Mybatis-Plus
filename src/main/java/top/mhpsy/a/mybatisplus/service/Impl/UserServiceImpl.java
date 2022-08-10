package top.mhpsy.a.mybatisplus.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import top.mhpsy.a.mybatisplus.mapper.UserMapper;
import top.mhpsy.a.mybatisplus.pojo.User;
import top.mhpsy.a.mybatisplus.service.UserService;

@Service
public class UserServiceImpl
        extends ServiceImpl<UserMapper, User>
        implements UserService {
}

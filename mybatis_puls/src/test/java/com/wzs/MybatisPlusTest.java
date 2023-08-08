package com.wzs;

import com.wzs.mapper.UserMapper;
import com.wzs.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author FateSealed
 * @date 2023/05/18 22:44
 **/
@SpringBootTest
public class MybatisPlusTest {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void testSelectList(){
//selectList()根据MP内置的条件构造器查询一个list集合，null表示没有条件，即查询所有
        userMapper.selectList(null).forEach(System.out::println);
    }

    @Test
    public void testInsert(){
        final User user = User.builder().age(24).email("940268050@qq.com").name("王之山").build();
        final int insert = userMapper.insert(user);
        System.out.println("受影响行数"+insert);
        System.out.println(user.getId());
    }

}
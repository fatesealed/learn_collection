package com.wzs;

import com.wzs.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @author FateSealed
 * @date 2023/05/19 16:08
 **/
@SpringBootTest
public class MybatisPlusWrapperTest {
    @Resource
    UserMapper userMapper;

    @Test
    void test01(){

    }
}
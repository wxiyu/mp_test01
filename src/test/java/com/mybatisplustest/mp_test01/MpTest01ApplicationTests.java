package com.mybatisplustest.mp_test01;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.mybatisplustest.mapper.UserMapper;
import com.mybatisplustest.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@SpringBootTest
class MpTest01ApplicationTests {
    @Autowired
    private UserMapper userMapper;

    /**
     * 查询user表数据
     */
    @Test
    public void testSelect() {
        System.out.println("-------------测试mybatis_plus 查询-------------");
        //参数是一个Wrapper，条件结构器，这里先不用 填null
        //查询所有的用户
        List<User> userList = userMapper.selectList(null);
        userList.forEach(System.out::println);
    }

    /**
     * 往user表插入数据
     */
    @Test
    public void testInsert() {
        System.out.println("-------------测试mybatis_plus 插入-------------");

        User liuliuliu = User.builder().age(66).name("liuliuliu").email("lululu.@com").build();
      /*  user.setAge(20);
        user.setName("xiao x x");
        user.setEmail("1234566@qq.com");*/
        userMapper.insert(liuliuliu);
    }

    /**
     * 根据条件查询user表
     */
    @Test
    public void testSelectOption() {
        System.out.println("----------根据条件查询user表-------------");
        User user = userMapper.selectById(1);
        System.out.println(user);
    }

    /**
     * 测试批量查询
     */
    @Test
    public void testSelectByBatcId() {
        List<User> users = userMapper.selectBatchIds(Arrays.asList(1, 2, 3));
        users.forEach(System.out::println);
    }

    /**
     * 条件查询
     */
    @Test
    public void testSelectByBatchIds() {
        HashMap<String, Object> map = new HashMap<>();
        //自定义条件
        map.put("name", "Tom");
        map.put("age", 28);
        List<User> users = userMapper.selectByMap(map);
        users.forEach(System.out::println);
    }

    /**
     * 条件查询使用Wrapper
     */
    @Test
    public void testWrapperSelect() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.between("age", 1, 18);
        queryWrapper.or();
        queryWrapper.like("name", "xiao");
        List<User> users = userMapper.selectList(queryWrapper);
        users.forEach(System.out::println);
    }
}

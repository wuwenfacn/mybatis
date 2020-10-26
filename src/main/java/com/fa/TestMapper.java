package com.fa;

import com.fa.entity.User;
import com.fa.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class TestMapper {
    public static void main(String[] args) {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder()
                .build(TestMapper.class.getClassLoader().getResourceAsStream("mybatis-config.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //插入一条数据
        /*int insert = mapper.insert(new User("333", "333"));
        System.out.println(insert);*/
        //根据id查询数据
        User user = mapper.selectById(1);
        System.out.println(user.toString());
    }
}

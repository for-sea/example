package com.forsea.example.dao;

import com.forsea.example.pojo.UserDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserDAO {
    @Select("<script>" +
            "select * from user" +
                "<where>" +
                    "<if test='uid != null'>and uid=#{uid}</if>" +
                "</where>" +
            "</script>")
    UserDO getUserByUid(Integer uid);
}

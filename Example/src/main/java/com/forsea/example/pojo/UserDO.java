package com.forsea.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDO {
    private Integer uid;
    private String username;
    private String sex;
    private Integer age;
    private String createTime;
    private String updateTime;
}

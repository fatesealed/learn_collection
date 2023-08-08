package com.wzs.pojo;

import lombok.Builder;
import lombok.Data;

/**
 * @author FateSealed
 * @date 2023/05/18 22:41
 **/
@Data
@Builder
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
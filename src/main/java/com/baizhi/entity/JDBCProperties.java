package com.baizhi.entity;

import lombok.Data;

@Data
public class JDBCProperties {
    private String driver;
    private String url;
    private String username;
    private String password;
}

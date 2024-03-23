package com.sophia.shortlink.admin.test;

public class UserTableShardingTest {
    public static final String SQL = "create table t_user_%d\n" +
            "(\n" +
            "    id            bigint auto_increment comment 'ID'\n" +
            "        primary key,\n" +
            "    username      varchar(256) null comment 'username',\n" +
            "    password      varchar(512) null comment 'password',\n" +
            "    real_name     varchar(256) null comment 'real name',\n" +
            "    phone         varchar(128) null comment 'phone number',\n" +
            "    mail          varchar(512) null comment 'email',\n" +
            "    deletion_time bigint       null comment 'deleted at(timestamp)',\n" +
            "    create_time   datetime     null comment 'created at',\n" +
            "    update_time   datetime     null comment 'updated at',\n" +
            "    del_flag      tinyint(1)   null comment '0: false 1: true',\n" +
            "    constraint idx_unique_username\n" +
            "        unique (username)\n" +
            ");";

    public static void main(String[] args) {
        for (int i = 0; i < 16; i++) {
            System.out.printf((SQL) + "%n",i);
        }
    }
}

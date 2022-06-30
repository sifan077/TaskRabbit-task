package gdufs.agency.entity;

import lombok.Data;

@Data
public class User {
    private Integer id;

    private String openId;

    private String nickName;

    private String gender;

    private String city;

    private String country;

    private String avatarUrl;

    private String unionId;

    private String province;

    private String phonenum;

    private String academy;

    private String address;

    private Double balance;

}
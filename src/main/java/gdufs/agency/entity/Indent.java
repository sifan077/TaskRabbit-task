package gdufs.agency.entity;

import lombok.Data;

@Data
public class Indent {
    private Integer indentid;

    private Integer type;

    private Float price;

    private String description;

    private String address;

    private Integer state;

    private String publishid;

    private String publishtime;

    private String plantime;

}
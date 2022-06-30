package gdufs.agency.entity;

import lombok.Data;

@Data
public class Comment {
    private Integer commentid;

    private String publishid;

    private String acceptid;

    private Integer indentid;

    private String content;

}
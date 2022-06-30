package gdufs.agency.entity;

import lombok.Data;

@Data
public class Acceptance extends AcceptanceKey {
    private String acceptedtime;

    private String finishedtime;

    private Integer state;
}
package com.ssafy.rasingdust.domain.user.dto;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class UserDto {
    private Long id;
    private String userName;
    private LocalDateTime createDate;
    private int solvedCnt;
    private int bottle;
    private int growthPoint;
}

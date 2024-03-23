package com.ssafy.rasingdust.global.result;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResultCode {
    //User
    GET_USERLIST_SUCCESS(200, "유저리스트 검색에 성공하였습니다."),

    //Follow
    CREATE_FOLLOW_SUCCESS(201, "해당 유저 팔로우를 성공하였습니다."),
    DELETE__UNFOLLOW_SUCCESS(201, "해당 유저 언팔로우를 성공하였습니다."),
    GET_FOLLOWINGLIST_SUCCESS(200, "유저의 팔로잉 리스트 조회에 성공하였습니다."),
    GET_FOLLOWERLIST_SUCCESS(200, "유저의 팔로워 리스트 조회에 성공하였습니다."),



    ;

    private final int status;
    private final String message;
}

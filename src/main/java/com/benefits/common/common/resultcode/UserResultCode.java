package com.benefits.common.common.resultcode;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum UserResultCode implements ResultCodeIfs {

    OK(200,200,"성공"),
    CREATE(201,201,"성공"),
    BAD_REQUEST(HttpStatus.BAD_REQUEST.value(), 400, "잘못 된 요청"),

    NOT_FOUND(HttpStatus.NOT_FOUND.value(), 404, "해당 유저가 존재하지 않습니다"),

    ;

    private final Integer httpStatusCode;
    private final Integer resultCode;
    private final String message;
}

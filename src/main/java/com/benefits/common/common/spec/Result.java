package com.benefits.common.common.spec;

import com.benefits.common.common.resultcode.ResultCodeIfs;
import com.benefits.common.common.resultcode.UserResultCode;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Result {
    private Integer resultCode;
    private String resultMessage;
    private String resultDescription;

    public static Result OK(){
        return Result.builder()
                .resultCode(UserResultCode.OK.getResultCode())
                .resultMessage(UserResultCode.OK.getMessage())
                .resultDescription("성공")
                .build();
    }
    public static Result CREATE(){
        return Result.builder()
                .resultCode(UserResultCode.CREATE.getResultCode())
                .resultMessage(UserResultCode.CREATE.getMessage())
                .resultDescription("성공")
                .build();
    }

    public static Result ERROR(ResultCodeIfs resultCodeIfs){
        return Result.builder()
                .resultCode(resultCodeIfs.getResultCode())
                .resultMessage(resultCodeIfs.getMessage())
                .resultDescription("실패")
                .build();
    }

    public static Result ERROR(ResultCodeIfs resultCodeIfs, String description){
        return Result.builder()
                .resultCode(resultCodeIfs.getResultCode())
                .resultMessage(resultCodeIfs.getMessage())
                .resultDescription(description)
                .build();
    }

}

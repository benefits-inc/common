package com.benefits.common.common.exception;

import com.benefits.userservice.common.resultcode.ResultCodeIfs;

public interface ApiExceptionIfs {
    ResultCodeIfs getResultCodeIfs();
    String getErrorMessage();

}

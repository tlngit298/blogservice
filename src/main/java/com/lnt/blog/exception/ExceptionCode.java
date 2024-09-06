package com.lnt.blog.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
public enum ExceptionCode {
    UNCATEGORIZED_EXCEPTION(5000, "Uncategorized exception.")
    ;

    ExceptionCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    private final int code;
    private final String message;
}

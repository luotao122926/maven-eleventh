package com.vip.project.utils;

import lombok.Data;
import org.springframework.stereotype.Component;

import static com.vip.project.utils.Constants.*;

/**
 * @Author luotao
 */
@Data
@Component
public class Result<T> {

    private String msg;
    private int status;
    private T data;

    public static <T> Result success(T t){
        Result<T> result = new Result<>();
        result.setMsg(SUCCESS_MSG);
        result.setStatus(SUCCESS_STATUS_200);
        result.setData(t);
        return result;
    }

    public static Result error(){
        Result result = new Result();
        result.setMsg(ERROR_MSG);
        result.setStatus(ERROR_STATUS_404);
        return result;
    }
}

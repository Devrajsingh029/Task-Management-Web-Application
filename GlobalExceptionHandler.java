package com.example.taskmanager.exception;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public Map<String,String> handle(){
        Map<String,String> m=new HashMap<>();
        m.put("error","Something went wrong");
        return m;
    }
}
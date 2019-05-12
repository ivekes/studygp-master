package com.wzk.c1;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyThead {
    public static void main(String[] args){
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        System.out.println("敏感操作");
        executorService.execute(new Thread(()->{
            System.out.println("记录日志");
        }));
        System.out.println("success");
    }
}

package com.ohgiraffers.section02.functionalinterface;

import java.time.LocalDateTime;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

public class Application2 {
    public static void main(String[] args) {
        /* 수업목표. 표준함수적 인터페이스 중 Supplier에 대해 이해하고 사용할 수 있다. */
        Supplier<LocalDateTime> supplier = () -> LocalDateTime.now();
        System.out.println(supplier.get());

        BooleanSupplier booleanSupplier = () -> {
            int random = (int) (Math.random() *2);
            return random == 0 ? false: true;
        };

        System.out.println("랜덤 T/F: " + booleanSupplier.getAsBoolean());
    }
}

package com.sgl.git;

import java.time.ZonedDateTime;
import java.util.Date;

public class GitTest {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);

        Date date = new Date();
        System.out.println(date);
    }
}

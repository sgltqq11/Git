package com.sgl.git;

import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.util.Date;

public class GitTest {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);

        Date date = new Date();
        System.out.println(date);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        simpleDateFormat.format(date);
        System.out.println(simpleDateFormat);

        System.out.println("git by hot-fix");

        System.out.println("hello master");
    }
}

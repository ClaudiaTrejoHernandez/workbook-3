package com.pluralsight;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        //Workbook-2: Section 2-2 Date Basics - Exercise 2

        LocalDate today = LocalDate.now();
        DateTimeFormatter fmt1;
        DateTimeFormatter fmt2;
        DateTimeFormatter fmt3;
        DateTimeFormatter fmt4;

        //Print date: 04/24/2025
        fmt1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedDate1 = today.format(fmt1);
        System.out.println(formattedDate1);

        //Print date: 2021-09-05
        System.out.println(today);

        //Print date: April 24, 2025
        fmt2 = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
        String formattedDate2 = today.format(fmt2);
        System.out.println(formattedDate2);

        //Print date & time: Thursday, April 24, 2025 (display in GMT time)
        ZonedDateTime nowGMT = Instant.now().atZone(ZoneOffset.UTC);
        fmt3 = DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm 'GMT' ");
        String formattedDate3 = nowGMT.format(fmt3);
        System.out.println(formattedDate3);


        //Challenge: display 5:02 on 05-Sep-2021 (in my local time zone)
        ZonedDateTime pacificZone = ZonedDateTime.now(ZoneId.of("US/Pacific"));
        fmt4 = DateTimeFormatter.ofPattern("HH:mm z 'on' dd-MMM-yyyy");
        String formattedDate4 = pacificZone.format(fmt4);
        System.out.println(formattedDate4);
    }
}
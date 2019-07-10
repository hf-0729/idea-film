package com.test;

import java.sql.Date;
import java.sql.SQLOutput;

public class date {

    public static void main(String[] args) {
        Date date = new Date(new java.util.Date().getTime());
        System.out.println(date);

        java.util.Date date1 = new java.util.Date();
        int oid = (int) date1.getTime()*-1;
        System.out.println(oid);
    }



}

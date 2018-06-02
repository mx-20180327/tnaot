package com.mongcent.tnaot;

import com.mongcent.tnaot.model.TUser;

import java.util.ArrayList;
import java.util.List;

public class Java8Type {

    public static void main(String[] args) {
        //testList();
        testUser();
    }

    public static void testList() {
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < 20; i++) {
            list.add(i + "");
        }
        //list.stream().forEach(System.out::println);
        list.stream().filter((s) -> s.startsWith("1")).forEach(System.out::println);
    }

    public static void testUser() {
        List<TUser> list = new ArrayList<TUser>();
        for (int i = 0; i < 20; i++) {
            list.add(new TUser(Long.valueOf(i + ""), i + 10, "name" + i));
        }
        list.stream().forEach(System.out::println);
        list.stream().forEach((s) -> System.out.println(s.getName()));
        //list.stream().filter((s) -> s.startsWith("1")).forEach(System.out::println);
    }
}

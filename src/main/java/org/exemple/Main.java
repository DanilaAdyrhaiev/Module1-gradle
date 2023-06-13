package org.exemple;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        User user = new User("Dan", "Adyrhaiev");
        Gson gson = new Gson();
        String val = gson.toJson(user);
        System.out.println(val);
    }
}
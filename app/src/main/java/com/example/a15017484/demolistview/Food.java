package com.example.a15017484.demolistview;

/**
 * Created by 15017484 on 25/4/2017.
 */

public class Food {
    private int id;
    private String name;
    private boolean star;

    public Food(int id, String name, boolean star) {
        this.id = id;
        this.name = name;
        this.star = star;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isStar() {
        return star;
    }

}

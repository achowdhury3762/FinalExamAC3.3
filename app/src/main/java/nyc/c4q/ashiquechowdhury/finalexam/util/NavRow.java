package nyc.c4q.ashiquechowdhury.finalexam.util;

import android.support.annotation.DrawableRes;

/**
 * Created by ashiquechowdhury on 2/12/17.
 */
public class NavRow {
    @DrawableRes
    private int drawableInt;

    private String name;

    public NavRow(int id, String name){
        drawableInt = id;
        this.name = name;
    }

    public int getDrawableInt() {
        return drawableInt;
    }

    public String getName() {
        return name;
    }
}

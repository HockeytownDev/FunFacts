package com.example.matt.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by Matt on 12/8/2017.
 */

public class ColorWheel {

    public int getColor()
    {
        String[] colors =
                {
                        "#39add1", // light blue
                        "#3079ab", // dark blue
                        "#c25975", // mauve
                        "#e15258", // red
                        "#f9845b", // orange
                        "#838cc7", // lavender
                        "#7d669e", // purple
                        "#53bbb4", // aqua
                        "#51b46d", // green
                        "#e0ab18", // mustard
                        "#637a91", // dark gray
                        "#f092b0", // pink
                        "#b7c0c7"  // light gray
                };

        Random random = new Random();
        int randomNumber = random.nextInt(colors.length);
        int color = Color.parseColor(colors[randomNumber]);
        return color;

    }

}

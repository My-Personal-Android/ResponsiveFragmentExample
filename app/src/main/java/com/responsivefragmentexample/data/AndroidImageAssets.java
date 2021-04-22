package com.responsivefragmentexample.data;

import com.responsivefragmentexample.R;

import java.util.ArrayList;
import java.util.List;

// Class for storing all the image drawable resources in ArrayLists
public class AndroidImageAssets {

    // Lists for all AndroidMe images
    // Broken down into heads, bodies, legs, and all images

    private static final List<Integer> heads = new ArrayList<Integer>() {{
        add(R.drawable.head1);
        add(R.drawable.head2);
        add(R.drawable.head3);
    }};

    private static final List<Integer> bodies = new ArrayList<Integer>() {{
        add(R.drawable.body1);
        add(R.drawable.body2);
        add(R.drawable.body3);
    }};

    private static final List<Integer> legs = new ArrayList<Integer>() {{
        add(R.drawable.legs1);
        add(R.drawable.legs2);
        add(R.drawable.legs3);

    }};

    private static final List<Integer> all = new ArrayList<Integer>() {{
        addAll(heads);
        addAll(bodies);
        addAll(legs);
    }};


    // Getter methods that return lists of all head images, body images, and leg images

    public static List<Integer> getHeads() {
        return heads;
    }

    public static List<Integer> getBodies() {
        return bodies;
    }

    public static List<Integer> getLegs() {
        return legs;
    }

    // Returns a list of all the images combined: heads, bodies, and legs in that order
    public static List<Integer> getAll() {
        return all;
    }
}

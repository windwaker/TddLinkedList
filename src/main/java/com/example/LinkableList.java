package com.example;

/**
 * Created by harric13 on 5/4/2017.
 */
public class LinkableList {

    boolean empty = true;

    public boolean isEmpty()
    {
        return empty;
    }

    public void add(final int i)
    {
        empty = false;
    }

    public void remove(final int i)
    {
        empty = true;
    }
}

package com.jethro;

import java.util.Objects;

public class Point {
    private int x;
    private int y ;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) // check to see if this object has the same reference in memory
            return true;
        // down cast object to Point class
        if (!(obj instanceof Point)) { // if object isn't an instance of the Point Class return false
            return false;
        }
        var otherObject = (Point)obj;
        return otherObject.x == x && otherObject.y == y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}

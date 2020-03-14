package com.jethro;


import java.awt.*;

public class Main {

    public static void main(String[] args) {
//	byte x = 1;
//	byte y = 1;
//	x = 2;
	Point point1 = new Point(1, 1);
	Point point2 = point1;
	point1.x = 2;
	System.out.println(point2);


    }
}

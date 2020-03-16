package com.jethro;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var textBox1 = new TextBox(); // Create new instance of the class
        textBox1.setText("rBox 1");
        System.out.println(textBox1.text.toUpperCase());

        var textBox2 = new TextBox();
        textBox2.setText("Box 2");
        System.out.println(textBox2.text);
    }
}

package com.jethro;

public class Main {

    public static void main(String[] args) {
        var control = new UIControl(true);
        var textBox = new TextBox();
        show(textBox); // Upcasting Cast the object to it's parent

    }
    // Upcasting
    public static void show (UIControl control) {
        if (control instanceof  TextBox) {
            // will return true if object is an instance of the textBox
            // DownCasting
            var textBox = (TextBox)control;
            textBox.setText("Hello World");
        }


        System.out.println(control);
    }
}

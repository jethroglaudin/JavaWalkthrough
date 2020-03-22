package com.jethro;

public class Main {

    public static void main(String[] args) {

        UIControl[] controls = { new TextBox(), new CheckBox() };
        for (var control : controls){
            control.render();
        }
    }
//        var control = new UIControl(true);
//        var textBox = new TextBox();
//        show(textBox); // Upcasting Cast the object to it's parent

//        var point1 = new Point(1, 2);
//        var point2 = new Point(1, 2);
//        System.out.println(point1.equals(point2));
//        System.out.println(point1.equals(new TextBox()));
//        System.out.println(point1.hashCode());
//        System.out.println(point2.hashCode());


    // Upcasting
//    public static void show (UIControl control) {
//        if (control instanceof  TextBox) {
//            // will return true if object is an instance of the textBox
//            // DownCasting
//            var textBox = (TextBox)control;
//            textBox.setText("Hello World");
//        }
//
//
//        System.out.println(control);
//    }
}

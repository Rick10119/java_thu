// Example for PPT page No.10

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class BindingDemo {
    public static void main(String[] args) {
        DoubleProperty d1 = new SimpleDoubleProperty(1);
        DoubleProperty d2 = new SimpleDoubleProperty(2);

        System.out.println("d1 is " + d1.getValue() + " d2 is " + d2.getValue());

        d1.bind(d2);
        System.out.println("d1 is " + d1.getValue() + " d2 is " + d2.getValue());

        d2.setValue(30);
        System.out.println("d1 is " + d1.getValue() + " d2 is " + d2.getValue());
    }
}
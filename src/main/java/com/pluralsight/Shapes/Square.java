package com.pluralsight.Shapes;

import com.pluralsight.Shape;
import com.pluralsight.Turtle;

import java.awt.*;

public class Square extends Shape {
    private double size;

    public Square(Turtle turtle, Point location, Color borderColor, int borderWidth, double size) {
        super(turtle, location, borderColor, borderWidth);
        this.size = size;
    }


    @Override
    public void paint() {
        prepPen();

        jumpTo(location);
        turtle.setHeading(0);
        for (int i = 1; i < 4; i++) {
            turtle.forward(size);
            turtle.turnRight(90);
        }

    }
}

package com.pluralsight.Shapes;

import com.pluralsight.Shape;
import com.pluralsight.Turtle;

import java.awt.*;
import java.awt.geom.Point2D;

public class Square extends Shape {
    private double size;

    public Square(Turtle turtle, Point2D location, Color borderColor, int borderWidth, double size) {
        super(turtle, location, borderColor, borderWidth);
        this.size = size;
    }


    @Override
    public void paint() {
        prepPen();

        jumpTo(location);
        turtle.setHeading(0);
        for (int i = 0; i < 4; i++) {
            turtle.forward(size);
            turtle.turnRight(90);
        }

    }
}

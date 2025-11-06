package com.pluralsight.Shapes;

import com.pluralsight.Shape;
import com.pluralsight.Turtle;

import java.awt.*;
import java.awt.geom.Point2D;

public class Triangle extends Shape {
    private double side;

    public Triangle(Turtle turtle, Point2D location, Color borderColor, int borderWidth, double side) {
        super(turtle, location, borderColor, borderWidth);
        this.side = side;
    }

    @Override
    public void paint() {
        prepPen();
        jumpTo(location);
        turtle.setHeading(0);
        for (int i = 0; i <3; i++) {
            turtle.forward(side);
            turtle.turnRight(120);
        }
    }
}

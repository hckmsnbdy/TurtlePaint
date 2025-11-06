package com.pluralsight.Shapes;

import com.pluralsight.Shape;
import com.pluralsight.Turtle;

import java.awt.*;
import java.awt.geom.Point2D;

public class Circle extends Shape {
    private double radius;

    public Circle(Turtle turtle, Point2D location, Color borderColor, int borderWidth, double radius) {
        super(turtle, location, borderColor, borderWidth);
        this.radius = radius;
    }

    @Override
    public void paint() {
        prepPen();

        double  x1 = location.getX() + radius;
        double y1 = location.getY();

        jumpTo(x1, y1);

        int steps = 72;
        double turnAngle = 360/steps;

        double segmentLength = (2*Math.PI*radius)/steps;

        turtle.setHeading(90);

        for (int i = 0; i <= steps; i++) {
            turtle.turnRight(turnAngle);
            turtle.forward(segmentLength);
        }


    }
}

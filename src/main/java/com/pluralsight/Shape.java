package com.pluralsight;

import java.awt.*;
import java.awt.geom.Point2D;

public abstract class Shape {

    protected Turtle turtle;
    protected Point2D location;
    protected Color borderColor;
    protected int borderWidth;

    public Shape(Turtle turtle, Point2D location, Color borderColor, int borderWidth) {
        this.turtle = turtle;
        this.location = location;
        this.borderColor = borderColor;
        this.borderWidth = borderWidth;
    }

    public abstract void paint();

    protected void prepPen(){
        turtle.setColor(borderColor);
        turtle.setPenWidth(borderWidth);
    }
    protected void jumpTo(Point2D p){
        turtle.penUp();
        turtle.goTo(p);
        turtle.penDown();
    }
    protected void jumpTo(double x, double y){
        turtle.penUp();
        turtle.goTo(x, y);
        turtle.penDown();
    }
}

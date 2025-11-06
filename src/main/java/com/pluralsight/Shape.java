package com.pluralsight;

import java.awt.*;

public abstract class Shape {

    protected Turtle turtle;
    protected Point location;
    protected Color borderColor;
    protected int borderWidth;

    public Shape(Turtle turtle, Point location, Color borderColor, int borderWidth) {
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
    protected void jumpTo(int x, int y){
        turtle.penUp();
        turtle.goTo(x, y);
        turtle.penDown();
    }
}

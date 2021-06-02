package com.techzealot.patterns.behavior.visitor;

public interface Shape {

    void moveTo(int x,int y);
    void draw();
    String accept(ShapeVisitor shapeVisitor);
}

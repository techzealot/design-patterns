package com.techzealot.patterns.behavior.visitor;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Rectangle implements Shape {
    private int id;
    private int x;
    private int y;
    private int width;
    private int height;

    @Override
    public void moveTo(int x, int y) {

    }

    @Override
    public void draw() {

    }

    @Override
    public String accept(ShapeVisitor shapeVisitor) {
        return shapeVisitor.visitRectangle(this);
    }
}

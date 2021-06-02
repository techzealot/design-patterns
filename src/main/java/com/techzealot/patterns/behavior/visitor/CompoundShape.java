package com.techzealot.patterns.behavior.visitor;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class CompoundShape implements Shape {
    private int id;

    private List<Shape> children = new ArrayList<>();

    public CompoundShape(int id) {
        this.id = id;
    }

    @Override
    public void moveTo(int x, int y) {

    }

    @Override
    public void draw() {

    }

    @Override
    public String accept(ShapeVisitor shapeVisitor) {
        return shapeVisitor.visitCompound(this);
    }

    public CompoundShape add(Shape shape) {
        children.add(shape);
        return this;
    }
}

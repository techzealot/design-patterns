package com.techzealot.patterns.behavior.visitor;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data()
public class Circle extends Dot {

    private int radius;

    public Circle(int id, int x, int y, int radius) {
        super(id, x, y);
        this.radius = radius;
    }

    @Override
    public String accept(ShapeVisitor shapeVisitor) {
        return shapeVisitor.visitCircle(this);
    }
}

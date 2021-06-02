package com.techzealot.patterns.behavior.visitor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dot implements Shape {
    private int id;
    private int x;
    private int y;


    @Override
    public void moveTo(int x, int y) {

    }

    @Override
    public void draw() {

    }

    @Override
    public String accept(ShapeVisitor shapeVisitor) {
        return shapeVisitor.visitDot(this);
    }
}

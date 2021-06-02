package com.techzealot.patterns.behavior.visitor;

public interface ShapeVisitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompound(CompoundShape compoundShape);
}

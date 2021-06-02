package com.techzealot.patterns.behavior.visitor;

public class JsonExportVisitor implements ShapeVisitor{
    @Override
    public String visitDot(Dot dot) {
        return null;
    }

    @Override
    public String visitCircle(Circle circle) {
        return null;
    }

    @Override
    public String visitRectangle(Rectangle rectangle) {
        return null;
    }

    @Override
    public String visitCompound(CompoundShape compoundShape) {
        return null;
    }
}

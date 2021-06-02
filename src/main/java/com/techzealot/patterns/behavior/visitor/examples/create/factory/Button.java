package com.techzealot.patterns.behavior.visitor.examples.create.factory;

/**
 * Common interface for all buttons.
 */
public interface Button {
    void render();
    void onClick();
}
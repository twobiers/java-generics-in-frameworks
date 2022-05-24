package io.github.twobiers.generics.spring;

public class NumberBoundedBox<T extends Number> extends Box<T> {
  public NumberBoundedBox(T value) {
    super(value);
  }
}

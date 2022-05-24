package io.github.twobiers.generics.micronaut;

public class NumberBoundedBox<T extends Number> extends Box<T> {

  public NumberBoundedBox(T value) {
    super(value);
  }
}

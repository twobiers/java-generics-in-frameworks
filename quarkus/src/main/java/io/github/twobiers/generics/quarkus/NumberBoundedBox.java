package io.github.twobiers.generics.quarkus;

public class NumberBoundedBox<T extends Number> extends Box<T> {

  public NumberBoundedBox(T value) {
    super(value);
  }

  // Make class proxyable
  protected NumberBoundedBox() {
    super();
  }
}

package io.github.twobiers.generics.quarkus;

import javax.enterprise.context.Dependent;

public class Box<T> {
  private T value;

  public Box(T value) {
    this.value = value;
  }

  // Make class proxyable
  protected Box() {}

  public T getValue() {
    return value;
  }

  public void setValue(T value) {
    this.value = value;
  }
}

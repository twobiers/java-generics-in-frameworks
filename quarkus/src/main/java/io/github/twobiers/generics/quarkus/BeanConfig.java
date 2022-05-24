package io.github.twobiers.generics.quarkus;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

public class BeanConfig {
  @Produces
  @ApplicationScoped
  public Box<Integer> integerBox() {
    return new Box<>(1);
  }

  @Produces
  @ApplicationScoped
  public Box<String> stringBox() {
    return new Box<>("String");
  }

  @Produces
  @ApplicationScoped
  public NumberBoundedBox<Double> doubleNumberBoundedBox() {
    return new NumberBoundedBox<>(2.1);
  }
}

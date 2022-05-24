package io.github.twobiers.generics.micronaut;

import io.micronaut.context.annotation.Factory;
import jakarta.inject.Singleton;

@Factory
public class BeanConfig {
  @Singleton
  public Box<Integer> integerBox() {
    return new Box<>(1);
  }

  @Singleton
  public Box<String> stringBox() {
    return new Box<>("String");
  }

  @Singleton
  public NumberBoundedBox<Double> doubleNumberBoundedBox() {
    return new NumberBoundedBox<>(2.1);
  }
}

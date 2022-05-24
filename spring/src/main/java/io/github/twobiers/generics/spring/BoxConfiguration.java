package io.github.twobiers.generics.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoxConfiguration {
  @Bean
  public Box<Integer> integerBox() {
    return new Box<>(1);
  }

  @Bean
  public Box<String> stringBox() {
    return new Box<>("String");
  }

  @Bean
  public NumberBoundedBox<Double> numberBoundedBox() {
    return new NumberBoundedBox<>(2.1);
  }
}

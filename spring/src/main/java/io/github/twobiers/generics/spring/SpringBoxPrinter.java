package io.github.twobiers.generics.spring;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class SpringBoxPrinter implements ApplicationListener<ApplicationReadyEvent> {

  private final Box<Integer> integerBox;
  private final Box<String> stringBox;
  private final NumberBoundedBox<Double> doubleNumberBoundedBox;
  // Spring won't initialize an application context
  // private final Box<Object> objectBox;

  public SpringBoxPrinter(Box<Integer> integerBox,
      Box<String> stringBox,
      NumberBoundedBox<Double> doubleNumberBoundedBox
      // Box<Object> objectBox
  ) {
    this.integerBox = integerBox;
    this.stringBox = stringBox;
    this.doubleNumberBoundedBox = doubleNumberBoundedBox;
    // this.objectBox = objectBox;
  }

  @Override
  public void onApplicationEvent(ApplicationReadyEvent event) {
    System.out.printf("IntegerBox Value: %s%n", integerBox.getValue());
    System.out.printf("StringBox Value: %s%n", stringBox.getValue());
    System.out.printf("NumberBoundedBox Value: %s%n", doubleNumberBoundedBox.getValue());
  }
}

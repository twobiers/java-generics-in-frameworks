package io.github.twobiers.generics.quarkus;


import io.quarkus.runtime.StartupEvent;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;

@ApplicationScoped
public class StartupListener {

  private final Box<Integer> integerBox;
  private final Box<String> stringBox;
  private final NumberBoundedBox<Double> doubleNumberBoundedBox;

  @Inject
  public StartupListener(Box<Integer> integerBox,
      Box<String> stringBox,
      NumberBoundedBox<Double> doubleNumberBoundedBox
  ) {
    this.integerBox = integerBox;
    this.stringBox = stringBox;
    this.doubleNumberBoundedBox = doubleNumberBoundedBox;
  }

  public void onStart(@Observes StartupEvent event) {
    System.out.printf("IntegerBox Value: %s%n", integerBox.getValue());
    System.out.printf("StringBox Value: %s%n", stringBox.getValue());
    System.out.printf("NumberBoundedBox Value: %s%n", doubleNumberBoundedBox.getValue());
  }
}

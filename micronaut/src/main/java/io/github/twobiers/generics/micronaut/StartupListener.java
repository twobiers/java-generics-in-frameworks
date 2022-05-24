package io.github.twobiers.generics.micronaut;


import io.micronaut.context.event.ApplicationEventListener;
import io.micronaut.runtime.server.event.ServerStartupEvent;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class StartupListener implements ApplicationEventListener<ServerStartupEvent> {

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

  @Override
  public void onApplicationEvent(ServerStartupEvent event) {
    System.out.printf("IntegerBox Value: %s%n", integerBox.getValue());
    System.out.printf("StringBox Value: %s%n", stringBox.getValue());
    System.out.printf("NumberBoundedBox Value: %s%n", doubleNumberBoundedBox.getValue());
  }
}

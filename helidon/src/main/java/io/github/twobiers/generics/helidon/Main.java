package io.github.twobiers.generics.helidon;

import io.helidon.microprofile.cdi.HelidonContainer;
import javax.enterprise.inject.spi.CDI;

public final class Main {

  public static void main(final String[] args) {
    var instance = HelidonContainer.instance();
    instance.start();

    var startupListener = CDI.current().select(StartupListener.class).get();
    startupListener.onStart();

    instance.shutdown();
  }
}

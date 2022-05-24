package io.github.twobiers.generics.quarkus;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class Main {
  public static void main(String[] args) {
    Quarkus.run(Application.class, args);
  }

  public static class Application implements QuarkusApplication {

    @Override
    public int run(String... args) throws Exception {
      // Just stop immediately. We are just printing things
      // Quarkus.waitForExit();
      return 0;
    }
  }
}

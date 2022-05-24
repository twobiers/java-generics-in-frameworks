package io.github.twobiers.generics.plain;

public class GenericReflectionHack {

  public static void main(String[] args) throws Exception {
    var integerBox = new Box<>(1);

    // We cannot set a string value, this will result in a compile error
    // integerBox.setValue("String");

    var setter = integerBox.getClass().getMethod("setValue", Object.class);
    System.out.printf("Setter method parameter type: %s%n", setter.getParameterTypes()[0]);

    System.out.printf("Value before method invocation: %s%n", integerBox.getValue());
    setter.invoke(integerBox, "String");
    System.out.printf("Value after method invocation: %s%n", integerBox.getValue());
  }
}

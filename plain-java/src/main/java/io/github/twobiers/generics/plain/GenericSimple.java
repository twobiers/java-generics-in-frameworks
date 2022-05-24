package io.github.twobiers.generics.plain;

public class GenericSimple {

  public static void main(String[] args) {
    var integerBox = new Box<>(1);
    var numberBoundedBox = new NumberBoundedBox<>(2.1);

    System.out.println(integerBox.getValue());
    System.out.println(numberBoundedBox.getValue());
  }
}

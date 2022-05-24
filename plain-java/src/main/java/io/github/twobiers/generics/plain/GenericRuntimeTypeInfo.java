package io.github.twobiers.generics.plain;

public class GenericRuntimeTypeInfo {

  public static void main(String[] args) {
    var integerBox = new Box<>(1);
    var numberBoundedBox = new NumberBoundedBox<>(2.1);

    System.out.println("Type Parameters of Integer Box: ");
    for(var param : integerBox.getClass().getTypeParameters()) {
      System.out.println(param);
    }

    System.out.println("Type Parameters of Number Bounded Box: ");
    for(var param : numberBoundedBox.getClass().getTypeParameters()) {
      System.out.println(param);
    }
    System.out.println(numberBoundedBox.getClass().getGenericSuperclass().getTypeName());
  }
}

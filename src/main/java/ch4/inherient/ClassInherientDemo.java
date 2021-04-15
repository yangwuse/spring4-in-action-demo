package ch4.inherient;

public class ClassInherientDemo {

  static class Parent {
    String house;
    String car;
    public Parent() {
      System.out.println("Parent: no house no car");
    }

    public Parent(String house, String car) {
      this.house = house;
      this.car = car;
      System.out.println("Parent: " + house + " " + car);
    }
  }

  static class Child extends Parent {
    public Child() {
      super();
      System.out.println("child: no house no car");
    }

    public Child(String childHours, String childCar) {
      super("parentHouse", "parentCar");
      System.out.println("child: " + childHours + " " + childCar);
    }
  }

  public static void main(String[] args) {
    Child child1 = new Child();
    Child child2 = new Child("bigHourse", "beautyCar");
  }

}

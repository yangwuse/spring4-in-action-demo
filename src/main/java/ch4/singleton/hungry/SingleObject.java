package ch4.singleton.hungry;

public class SingleObject {
  private static SingleObject instance = new SingleObject();
  private SingleObject() {}
  public static SingleObject getInstance() { return instance; }
  public void showMsg() {
    System.out.println("Hungry single object!!!");
  }
}

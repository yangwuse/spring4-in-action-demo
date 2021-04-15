package ch4.singleton.demo;

public class SingleObject {

  private static SingleObject instance = new SingleObject();

  // 关键：私有构造函数
  private SingleObject() {}

  public static SingleObject getInstance() {
    return instance;
  }

  public void showMsg() {
    System.out.println("Hello World!!!");
  }

}

package ch4.singleton.demo;

public class SingleObjectDemo {

  public static void main(String[] args) {
    SingleObject object = SingleObject.getInstance();
    object.showMsg();
  }
}

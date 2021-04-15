package ch4.singleton.register;

public class SingletonTest {
  public static void main(String[] args) {
    Singleton object = Singleton.getInstance();
    object.showMsg();
  }
}

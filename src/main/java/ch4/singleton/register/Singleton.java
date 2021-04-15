package ch4.singleton.register;


public class Singleton {
  private static class SingletonHolder {
    private static final Singleton INSTANCE = new Singleton();
  }
  private Singleton() {}
  public static final Singleton getInstance() {
    return SingletonHolder.INSTANCE;
  }
  public void showMsg() {
    System.out.println("register mode singleton!!!");
  }
}

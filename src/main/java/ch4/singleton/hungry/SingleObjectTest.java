package ch4.singleton.hungry;

public class SingleObjectTest {
  public static void main(String[] args) {
    SingleObject object = SingleObject.getInstance();
    object.showMsg();
  }
}

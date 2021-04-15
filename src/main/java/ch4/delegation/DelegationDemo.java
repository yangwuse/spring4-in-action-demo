package ch4.delegation;

// https://zh.wikipedia.org/wiki/%E5%A7%94%E6%89%98%E6%A8%A1%E5%BC%8F
public class DelegationDemo {

  interface I {
    void f();
    void g();
  }

  static class A implements I {
    public void f() {
      System.out.println("A: doing f()");
    }

    public void g() {
      System.out.println("A: doing g()");
    }
  }

  static class B implements I {
    public void f() {
      System.out.println("B: doing f()");
    }

    public void g() {
      System.out.println("B: doing g()");
    }
  }

  static class C implements I {
    I i = new A(); // delegation

    public void f() { i.f(); }
    public void g() { i.g(); }

    public void toA() { i = new A(); }
    public void toB() { i = new B(); }
  }

  public static void main(String[] args) {
    // C 代理器可以选择具体代理类
    C c = new C();
    c.f();
    c.g();
    c.toB();
    c.f();
    c.g();
  }


}

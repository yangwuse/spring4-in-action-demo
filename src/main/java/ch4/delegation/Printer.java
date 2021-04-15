package ch4.delegation;

public class Printer { // delegator
  ColorPrinter p = new ColorPrinter(); // new delegate
  void print() {
    p.print(); // deleagtion
  }
}

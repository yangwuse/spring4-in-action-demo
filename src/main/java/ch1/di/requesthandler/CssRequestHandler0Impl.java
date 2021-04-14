package ch1.di.requesthandler;

import ch1.di.request.Request;
import ch1.di.request.CssRequestImpl;

// 程序清单 1.2
public class CssRequestHandler0Impl implements RequestHandler {
  private Request quest;

  public CssRequestHandler0Impl() {
    this.quest = new CssRequestImpl(System.out); // 高内聚
  }

  @Override
  public void doRequestHandler() {
    quest.doRequest();
    System.out.println("do css request handler!!!");
  }
}

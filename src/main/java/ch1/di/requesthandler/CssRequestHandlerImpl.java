package ch1.di.requesthandler;

import ch1.di.request.Request;

// code 1.3
public class CssRequestHandlerImpl implements RequestHandler {

  private Request quest;

  public CssRequestHandlerImpl(Request quest) {
    this.quest = quest; // 依赖注入 Quest被注入进来
  }

  @Override
  public void doRequestHandler() {
    quest.doRequest();
    System.out.println("do css request handler!!!");
  }
}

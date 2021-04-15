package ch1.didemo.handler;

import ch1.didemo.request.Request;

public class HtmlHandlerImpl implements Handler{

  private Request request;

  // 构造器依赖注入 注入依赖的接口对象 具体类型通过Spring来配置注入 松耦合
  public HtmlHandlerImpl(Request request) {
    this.request = request;
  }

  @Override
  public void handler() {
    request.doRequest();
    System.out.println("do html handler!!!");
  }
}

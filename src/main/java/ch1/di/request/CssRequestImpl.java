package ch1.di.request;

import ch1.di.request.Request;

import java.io.PrintStream;

// 1.5
public class CssRequestImpl implements Request {

  private PrintStream stream;

  public CssRequestImpl(PrintStream stream) {
    this.stream = stream;
  }

  @Override
  public void doRequest() {
    stream.println("do css request!!!");
  }
}

package ch1.didemo.request;

import java.io.PrintStream;

public class HtmlRequestImpl implements Request {

  private PrintStream stream;
  public HtmlRequestImpl(PrintStream stream) {
    this.stream = stream;
  }

  @Override
  public void doRequest() {
    stream.println("stream: html request!!!");
  }
}

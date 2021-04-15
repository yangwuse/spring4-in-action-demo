package ch1.didemo;

import ch1.didemo.request.Request;
import ch1.didemo.handler.Handler;
import ch1.didemo.handler.HtmlHandlerImpl;
import ch1.didemo.request.HtmlRequestImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBeanConfig {

  @Bean
  public Handler handler() {
    return new HtmlHandlerImpl(request());
  }

  @Bean
  public Request request() {
    return new HtmlRequestImpl(System.out);
  }
}

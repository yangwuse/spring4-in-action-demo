package ch1.di;

import ch1.di.request.Request;
import ch1.di.requesthandler.CssRequestHandlerImpl;
import ch1.di.request.CssRequestImpl;
import ch1.di.requesthandler.RequestHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// 1.7 Spring 提供java配置bean依赖的方式 可替换xml配置方式
@Configuration
public class RequestHandlerConfig {

  @Bean
  public RequestHandler handler() {
    return new CssRequestHandlerImpl(request());
  }

  @Bean
  public Request request() {
    return new CssRequestImpl(System.out);
  }

}

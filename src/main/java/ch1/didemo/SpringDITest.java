package ch1.didemo;

import ch1.didemo.handler.Handler;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDITest {

  public static void main(String[] args) {

    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringBeanConfig.class);
    Handler handler = context.getBean(Handler.class);
    handler.handler();
    context.close();
  }

}

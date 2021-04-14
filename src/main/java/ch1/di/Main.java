package ch1.di;

import ch1.di.requesthandler.RequestHandler;
import org.junit.runner.Request;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// 1.8 加载xml配置文件获得knight对象的引用
public class Main {

  public static void main(String[] args) {
//    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("./knights.xml");
    // 通过context加载并组装bean java类配置方式
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(RequestHandlerConfig.class);
    RequestHandler handler = context.getBean(RequestHandler.class);
    handler.doRequestHandler();
    context.close();
  }

}

package ch4.aop;

import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Bean;

@Aspect
public class Audience2 {

  @Pointcut("execution(**ch4.aop.Performance.perform(..))") // 定义可重用切点表达式别名
  public void performance() {}

  @Before("performance()") // 重用切点
  public void silenceCellPhone() {
    System.out.println("Silencing cell phones");
  }

  @Before("performance()") // 切点表达式 表演之前
  public void takeSeats() {
    System.out.println("Taking seats");
  }

  @AfterReturning("performance()") // 表演后
  public void applause() {
    System.out.println("clap clap clap");
  }

  @AfterThrowing("performance()") // 表演失败后
  public void demandRefound() {
    System.out.println("Demanding a refund");
  }

}
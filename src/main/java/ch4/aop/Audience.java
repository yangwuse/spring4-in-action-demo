package ch4.aop;

import org.aspectj.lang.annotation.*;

@Aspect
public class Audience {

  @Before("execution(**ch4.aop.Performance.perform(..))") // 切点表达式 表演之前
  public void silenceCellPhone() {
    System.out.println("Silencing cell phones");
  }

  @Before("execution(**ch4.aop.Performance.perform(..))") // 切点表达式 表演之前
  public void takeSeats() {
    System.out.println("Taking seats");
  }

  @AfterReturning("execution(**ch4.aop.Performance.perform(..))") // 表演后
  public void applause() {
    System.out.println("clap clap clap");
  }

  @AfterThrowing("execution(**ch4.aop.Performance.perform(..))") // 表演失败后
  public void demandRefound() {
    System.out.println("Demanding a refund");
  }


}

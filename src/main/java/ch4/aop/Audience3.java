package ch4.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience3 {

  @Pointcut("execution(**ch4.aop.Performance.perform(..))")
  public void performace() {}

  @Around("performace()") // 环绕通知 最强的通知类型
  public void watchPerformance(ProceedingJoinPoint jp) {
    try {
      System.out.println("Silencing cell phone");
      System.out.println("Taking seats");
      jp.proceed();
      System.out.println("Clap clap clap");
    } catch (Throwable e) {
      System.out.println("Demanding a refund");
    }
  }
}

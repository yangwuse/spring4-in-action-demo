package ch4.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackCounter {

  public void trackPlayed(int trackNumber) {}
}

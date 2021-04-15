package ch2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

// 2.1
@Component
public class CDPlayer implements MediaPlayer{

  private CD cd;

  @Autowired(required = false) // 自动装配注解 构造器自动装配 @Autowired就是依赖声明的方式
  public CDPlayer(CD cd) {
    this.cd = cd;
  }

  @Override
  public void play() {
    cd.play();
  }

  @Autowired // setter方法自动装配
  public void setCD(CD cd) {
    this.cd = cd;
  }


  @Override
  @Autowired // 其他方法声明依赖
  public void insertCD(CD cd) {
    System.out.println("insert cd!!!");
    this.cd = cd;
  }



}

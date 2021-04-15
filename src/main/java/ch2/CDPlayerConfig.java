package ch2;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//2.3
@Configuration
//@ComponentScan(basePackages = {"ch2", "ch1"}) // 设置多个扫描基础包
@ComponentScan(basePackageClasses = {ch2.RockCD.class, ch2.CDPlayer.class}) // 指定类或接口
public class CDPlayerConfig {

  @Bean(name = "myRockCD")
  public CD rockCD() {
    return new RockCD();
  }

  @Bean(name = "myRandomCD")
  public CD randomCD() {
    int index = (int)Math.floor(Math.random() * 4);
    if (index == 0)
      return new RockCD();
    else if (index == 1)
      return new RockCD();
    else if (index == 2)
      return new RockCD();
    else
      return new RockCD();
  }

  @Bean
  public CDPlayer cdPlayer() {  // 显示手动装配
    return new CDPlayer(rockCD());
  }

  @Bean
  public CDPlayer anotherCDPlayer() {
    return new CDPlayer(rockCD()); // spring bean是单例的 多次调用rockCD()返回同一个实例
  }

  @Bean
  public CDPlayer cdPlayer(CD cd) { // spring通过方法参数自动装配cd到配置方法中 引用其他bean依赖的最佳配置
    return new CDPlayer(cd);
  }

  @Bean
  public CDPlayer cdPlayer2(CD cd) { // 构造器注入依赖
    CDPlayer player = new CDPlayer(cd);
    return player;
  }

  @Bean
  public CDPlayer cdPlayer3(CD cd) {  // set注入依赖
    CDPlayer player = cdPlayer();
    player.setCD(cd);
    return player;
  }
}

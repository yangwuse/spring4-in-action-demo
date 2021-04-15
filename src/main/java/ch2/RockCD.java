package ch2;

import org.springframework.stereotype.Component;

// 2.2
@Component("goodRodckCD") // 给组件ID命名
public class RockCD implements CD{

  private String title = "Rock CD";
  private String artist = "YW";

  @Override
  public void play() {
    System.out.println("Playing " + title + " by " + artist);
  }


}

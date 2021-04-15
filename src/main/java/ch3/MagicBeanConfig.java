package ch3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MagicBeanConfig {

  @Bean
  @Conditional(MagicExistsConditon.class)
  public MagicBean magicBean() {
    return new MagicBean();
  }

}

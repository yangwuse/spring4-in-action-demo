package ch3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.jndi.JndiObjectFactoryBean;

import javax.sql.DataSource;

@Profile("prod")
public class ProductionProfileConfig {

  @Bean
  public DataSource dataSource() {
    JndiObjectFactoryBean jndiObjectFactoryBean = new JndiObjectFactoryBean();
    jndiObjectFactoryBean.setJndiName("jdbc/myDS");
    jndiObjectFactoryBean.setResourceRef(true);
    jndiObjectFactoryBean.setProxyInterface(
        javax.sql.DataSource.class
    );
    return (DataSource) jndiObjectFactoryBean.getObject();
  }
}

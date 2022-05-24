package io.github.twobiers.generics.spring;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class SpringContextIntrospector implements ApplicationListener<ApplicationReadyEvent> {

  @Override
  public void onApplicationEvent(ApplicationReadyEvent event) {
    var integerBoxDef = event.getApplicationContext().getBeanFactory().getMergedBeanDefinition("integerBox");
    System.out.printf("IntegerBox target type: %s%n", integerBoxDef.getResolvableType());

    var stringBoxDef = event.getApplicationContext().getBeanFactory().getMergedBeanDefinition("stringBox");
    System.out.printf("StringBox target type: %s%n", stringBoxDef.getResolvableType());

    var boundedNumberBox = event.getApplicationContext().getBeanFactory().getMergedBeanDefinition("numberBoundedBox");
    System.out.printf("BoundedNumberBox target type: %s%n", boundedNumberBox.getResolvableType());
  }
}

package org.gagan.learningspringbeanlifecycle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearningSpringBeanLifeCycleApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(LearningSpringBeanLifeCycleApplication.class, args);
        context.close();
    }

}

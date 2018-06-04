package spring.knights;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by zjx on 2018/6/1.
 */
public class KnightMain {
    public static void main(String[] args) {
        //从xml中加载配置文件
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("knight.xml");
//        Knight knight = context.getBean(Knight.class);
//        knight.embarkOnQuest();
//        context.close();

        //从Java配置类中加载应用上下文
        ApplicationContext context = new AnnotationConfigApplicationContext(KnightConfig.class);
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();

    }
}

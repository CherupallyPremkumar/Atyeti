package SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCore {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("SpringCore/beans.xml");
        System.out.println("config loaded");
    }
}

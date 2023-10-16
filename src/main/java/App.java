import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean0 = (HelloWorld) applicationContext.getBean("helloWorld");
        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloWorld");
        Cat cat0 = (Cat) applicationContext.getBean("cat");
        Cat cat1 = (Cat) applicationContext.getBean("cat");

        System.out.println(bean0 == bean1);
        System.out.println(cat0 == cat1);

        System.out.println(bean0.getMessage());
    }
}
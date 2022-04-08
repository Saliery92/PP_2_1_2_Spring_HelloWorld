import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld firstBean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld secondBean =
                (HelloWorld) applicationContext.getBean("helloworld");
        boolean compareHW = firstBean == secondBean;
        System.out.println(compareHW);

        Cat thirdBean = (Cat) applicationContext.getBean("сat");
        Cat fourthBean = (Cat) applicationContext.getBean("сat");
        boolean compareCat = thirdBean == fourthBean;
        System.out.println(compareCat);
    }
}
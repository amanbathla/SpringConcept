import com.springPractice.Mobile;
import com.springPractice.Student;
import com.springPractice.Vechile;
import configuration.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
    public static void main(String[] args) {



//        // Xml Based configuration
//        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
//
//        Vechile obj = (Vechile) context.getBean("vechile");
//        obj.drive();

        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);

        Mobile mobile = factory.getBean(Mobile.class);
        mobile.config();



    }
}

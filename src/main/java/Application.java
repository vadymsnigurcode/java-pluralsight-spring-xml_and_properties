import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.CustomerService;
import service.CustomerServiceImpl;

public class Application {
    public static void main(String[] args) {
        //CustomerService  service = new CustomerServiceImpl();
        ApplicationContext appContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerService  service =
                appContext.getBean("customerService",CustomerService.class);
        System.out.println(service);

        CustomerService  service2 =
                appContext.getBean("customerService",CustomerService.class);
        System.out.println(service2);

        System.out.println(service.findAll().get(0).getFirstName());
    }
}

package ls.Driver;
import ls.Config.AppConfig;
import ls.bean.DBConnection;
import ls.service.CService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

    public static void main(String[] args)
    {
        //create an object to ApplicationContext
        AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);

        DBConnection bean = ac.getBean("con",DBConnection.class);
        CService bean2=ac.getBean("service", CService.class);
   bean.add();
    bean2.disp();
        //stop the container.
        ac.stop();

    }

}

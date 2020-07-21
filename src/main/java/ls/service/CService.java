package ls.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component("service")
@Service("service")
    public class CService
    {
        @Value("${name}")
        private String ename;
        @Value("${id}")
        private String eid;

        public CService()
        {
            System.out.println("from service===>");
        }

        public void disp(){
            System.out.println("name is "+ename +"\n id is "+eid);
        }

    }


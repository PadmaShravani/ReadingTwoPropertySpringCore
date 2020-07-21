package ls.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("con")
    public class DBConnection
    {
        @Value("${n1}")
        private int age;

        public DBConnection()
        {

            System.out.println(" am in DBConnection ==>");
        }


        public void add(){
            if (age>18){
                System.out.println("elegible for voting");
            }else
            {
                System.out.println("Not eligible for voting");
            }
        }
    }


package ls.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@ComponentScan( {"ls.bean","ls.service"})
//@PropertySource("classpath:App.properties")
//@PropertySource(
//        name = "props",
//        value = { "classpath:App.properties", "classpath:App2.properties" })
@PropertySources({
        @PropertySource("/App.properties"),
        @PropertySource("/App2.properties")
})
public class AppConfig {

}




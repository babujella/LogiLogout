package LoginLogout;

@EnableWebMvc  
@Configuration  
@ComponentScan({ "com.org.tech.controller.*" })  
public class AppConfig {  
    @Bean  
    public InternalResourceViewResolver viewResolver() {  
        InternalResourceViewResolver viewResolver  
                          = new InternalResourceViewResolver();  
        viewResolver.setViewClass(JstlView.class);  
        viewResolver.setPrefix("/WEB-INF/views/");  
        viewResolver.setSuffix(".jsp");  
        return viewResolver;  
    }  
}  


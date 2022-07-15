package LoginLogout;

@EnableWebSecurity  
@ComponentScan("com.org.tech")  
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {  

	@Bean  
	public UserDetailsService userDetailsService() {  
		InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();  
		manager.createUser(User.withDefaultPasswordEncoder()  
				.username("Babu").password("Jella").roles("ADMIN").build());  
		return manager;  
	}  

	@Override  
	protected void configure(HttpSecurity http) throws Exception {  

		http                              
		.authorizeRequests()  
		.anyRequest().hasRole("ADMIN")  
		.and().formLogin().and()  
		.httpBasic()  
		.and()  
		.logout()  
		.logoutUrl("/j_spring_security_logout")  
		.logoutSuccessUrl("/")  
		;  
	}  
}  
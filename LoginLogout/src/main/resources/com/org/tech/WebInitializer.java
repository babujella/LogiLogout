package LoginLogout;

public class WebInitializerr extends  
AbstractAnnotationConfigDispatcherServletInitializer {  
	@Override  
	protected Class<?>[] getRootConfigClasses() {  
		return new Class[] { WebSecurityConfig.class };  
	}  
	@Override  
	protected Class<?>[] getServletConfigClasses() {  
		// TODO Auto-generated method stub  
		return null;  
	}  
	@Override  
	protected String[] getServletMappings() {  
		return new String[] { "/" };  
	}  
}  

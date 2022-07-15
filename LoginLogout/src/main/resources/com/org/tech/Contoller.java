package LoginLogout;

@Controller  
public class Controller {  
    @RequestMapping(value = "/", method = RequestMethod.GET)  
    public String index() {  
        return "index";  
    }  
      
    @RequestMapping(value="/logout", method=RequestMethod.GET)  
    public String logoutPage(HttpServletRequest request, HttpServletResponse response) {  
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();  
        if (auth != null){      
           new SecurityContextLogoutHandler().logout(request, response, auth);  
        }
         return "redirect:/";  
     }  
}  
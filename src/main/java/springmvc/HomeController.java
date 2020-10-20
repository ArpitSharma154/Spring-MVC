package springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String index() 
	{
		System.out.println("About called");
		return "index";
	}

	// it will be called when home is hit
	@RequestMapping("/home")
	public String home()
	{
		System.out.println("this is home url");
		return "home";
	}
	
	// create new controller for about
	@RequestMapping("/about")
	public String about() 
	{
		System.out.println("About called");
		return "about";
	}
}

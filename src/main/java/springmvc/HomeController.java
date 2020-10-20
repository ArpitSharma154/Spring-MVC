package springmvc;

import java.awt.List;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
	public String home(Model model)
	{
		ArrayList<String> details = new ArrayList<String>();
		details.add("Arpit");
		details.add("Sharma");
		details.add("27 years");
		
		model.addAttribute("username","user");
		model.addAttribute("password","password");	
		model.addAttribute("details",details);
		
		return "home";
	}
	
	// create new controller for about
	@RequestMapping("/about")
	public String about() 
	{
		System.out.println("About called");
		return "about";
	}
	
	//modelandview implementation
	@RequestMapping("/help")
	public ModelAndView help()
	{
		//creating model and view object
		ModelAndView modelAndView = new ModelAndView();
		//setting the data
		modelAndView.addObject("name", "Arpit");
		//setting the page name
		modelAndView.setViewName("help");
		//name of view
		return modelAndView;
	}
	
}

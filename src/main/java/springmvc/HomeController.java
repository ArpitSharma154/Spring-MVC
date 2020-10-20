package springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	// it will be called when home is hit
	@RequestMapping("/")
	public String home()
	{
		System.out.println("this is home url");
		return"index";
	}
}

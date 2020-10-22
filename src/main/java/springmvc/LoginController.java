package springmvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import model.User;

//we will create handler here

@Controller
public class LoginController {

	// common for all handler methods and will get initialized before handler method
	@ModelAttribute
	public void commonDataForModel(Model model)
	{
		model.addAttribute("Header"  , "Login Page Created By Arpit");	
	}
	
	@RequestMapping("/login")
	public String  showForm(Model model)
	{
		return "LoginPage";
	}

	// model attribute implementation
	@RequestMapping(path="/processForm" , method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user , Model model)
	{
		// adding reference to model and sending to view	
		if(user.getEmail().equals("abc@abc.com") && user.getPassword().equals("1234"))
		{
			return "Success";
		}
		else
		{
           return "Error";
		}
	}
	
	/*
	 * // for better security we use post method
	 *  traditional approach (depricated)
	 * 
	 * @RequestMapping(path="/processForm", method = RequestMethod.POST) public
	 * String handleForm(HttpServletRequest request) { String email =
	 * request.getParameter("email"); String password =
	 * request.getParameter("password"); System.out.println("user email"+email);
	 * System.out.println("user "+password);
	 * 
	 * return "" ; }
	 */
	
	// without using model attribute
	
	/*
	 * @RequestMapping(path="/processForm" , method = RequestMethod.POST) public
	 * String handleForm(
	 * 
	 * @RequestParam(name = "email" , required = true) String userEmail,
	 * 
	 * @RequestParam(name = "password" , required = true) String password, Model
	 * model) { System.out.println("email :"+userEmail);
	 * System.out.println("password :"+password);
	 * 
	 * // adding reference to model and sending to view
	 * 
	 * User us = new User(); us.setEmail(userEmail); us.setPassword(password);
	 * 
	 * // adding value to model model.addAttribute("user", us);
	 * 
	 * if(userEmail.equals("abc@abc.com") && password.equals("1234")) { // adding
	 * values in model to navigate to success page (proceesing)
	 * model.addAttribute("email",userEmail);
	 * model.addAttribute("password",password); return "Success"; } else { return
	 * "Error"; } }
	 */
}

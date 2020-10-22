package springmvc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.Todo;

@Controller
public class TodoController {

	@RequestMapping(method = RequestMethod.GET , value = "/todoForm")
	String handleTodo(Model model)
	{
		List todoList = new ArrayList<Todo>();
		
		// todo obj 1
		Todo to1 = new Todo();
		to1.setActionID(12);
		to1.setActionDesc("learn java technology");
		to1.setActionType("learning java");
		
		// todo obj 2
		Todo to2 = new Todo();
		to2.setActionID(13);
		to2.setActionDesc("learn python technology");
		to2.setActionType("learning python");
		
		// todo obj 3
		Todo to3 = new Todo();
		to3.setActionID(14);
		to3.setActionDesc("learn c++ technology");
		to3.setActionType("learning c++");
		
		
		todoList.add(to1);
		todoList.add(to2);
		todoList.add(to3);
			
		model.addAttribute("todoList",todoList);
		model.addAttribute("heading", "Iterating todo objects");
		return("todo");
	}
}

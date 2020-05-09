package com.javatpoint;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class HelloController {
@RequestMapping(value="/hello", produces = MediaType.APPLICATION_JSON_VALUE)
@ResponseBody
	public String redirect()
	{
		return "hey man.. how are you?";
	}	
@RequestMapping("/helloagain")
public String display()
{
	return "final";
}
@RequestMapping("/wish")
public ModelAndView showMessage(
		@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
	System.out.println("in controller");
	String message="hey.. You are awesome.. ";
	ModelAndView mv = new ModelAndView("wish");
	mv.addObject("message", message);
	mv.addObject("name", name);
	return mv;
}
}

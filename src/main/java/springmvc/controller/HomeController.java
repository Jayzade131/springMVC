package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {	
	
	@RequestMapping("/home")
	public String  home(Model model)
	{
		model.addAttribute("name", "Jaykumar zade");
		model.addAttribute("id", 999);
		
		List<String> frd=new ArrayList<String>();
		frd.add("mohit");
		frd.add("avijeet");
		frd.add("amit");
		model.addAttribute("frds", frd);
		System.out.println("this is home url");
		
		return "index";
		
	}
	
	@RequestMapping("/about")
	public ModelAndView about()
	{
		System.out.println("about data here");
		ModelAndView mav=new ModelAndView();
		mav.addObject("name","Rajlaxmi meshram");
		mav.setViewName("about");
		
		return mav;
	}

}

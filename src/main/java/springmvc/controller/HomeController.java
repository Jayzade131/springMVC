package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
	public String about()
	{
		System.out.println("about data here");
		
		return "about";
	}

}

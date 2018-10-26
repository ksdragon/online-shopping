package pl.skoneczny.stepByStepApllication.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.kzn.onlineshopping.controller.PageController;

//created pabe contoroler
@Controller
public class PageController {
	
	private static final Logger logger = LoggerFactory.getLogger(PageController.class);

	@RequestMapping(value = {"/", "/home", "/index"})
	public ModelAndView index() {
		ModelAndView mv= new ModelAndView("page");
		mv.addObject("greeting", "Welcome in Spring MVC");
		return mv;
	}
	
	logger.info("Inside PageController index method - INFO");
	logger.debug("Inside PageController index method - DEBUG");
}

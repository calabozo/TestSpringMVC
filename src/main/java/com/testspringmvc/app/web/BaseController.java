package com.testspringmvc.app.web;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.testspringmvc.app.data.BasicModelBean;

@Controller
public class BaseController {
	static Logger log = Logger.getLogger(BaseController.class);

	@Autowired
	BasicModelBean basicModel;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String indexPage(ModelMap model) {
		log.debug("Called indexPage");
		int v = basicModel.getData();
		model.addAttribute("data", ++v);
		basicModel.setData(v);
		return "index";
	}
}

package com.plantplaces;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Administrator
 *Handle the /start end point
 *@return
 */

@Controller 
public class plantPlacesController {
	
	
	@RequestMapping("/start")
	public String Start() {
		
		return "start";
	}
	
	/**
	 * handle the / endpoint
	 * @return
	 */
	
	@RequestMapping("/")
	public String index() {
		
		return "start";
	}

}

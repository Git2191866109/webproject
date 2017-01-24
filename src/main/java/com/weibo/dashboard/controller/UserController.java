package com.weibo.dashboard.controller;


import com.weibo.dashboard.entity.User;
import com.weibo.dashboard.service.UserService;
import com.weibo.common.ResponseData;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/user")
public class UserController extends BaseController{
	private static Logger log = LogManager.getLogger(CommentController.class.getName());

	@Autowired
	private UserService userService;

	@RequestMapping("/layout")
	public String getUserPartialPage() {
		return "users/layout";
	}
	@ResponseBody
	@RequestMapping(value="/{name}",method=RequestMethod.GET)
	public Object findUser(ModelMap modelMap, @PathVariable("name")String name){
		User user = userService.select(name);
		return setSuccessResult(modelMap, user);
	}
	
	@ResponseBody
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public Object accountValid(ModelMap modelMap, @RequestBody User user){
		log.info(modelMap.toString());
		boolean res = userService.accountValid(user);
		return setSuccessResult(modelMap, res);
	}

	@ResponseBody
	@RequestMapping(value="/new",method=RequestMethod.POST)
	public ResponseData insert(@RequestBody User user){
		userService.insert(user);
		return new ResponseData(user);
	}
	
}

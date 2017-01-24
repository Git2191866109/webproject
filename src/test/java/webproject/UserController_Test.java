package webproject;

import com.weibo.dashboard.controller.BaseController;
import com.weibo.dashboard.entity.User;
import com.weibo.dashboard.service.UserService;
import com.weibo.common.ResponseData;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/user")
public class UserController_Test extends BaseController{
    private static Logger log = LogManager.getLogger(UserController_Test.class.getName());

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public Object findUser(ModelMap modelMap, @PathVariable("name") String name) {
        User user = userService.select(name);
        setSuccessResult(modelMap, user);
        return setSuccessResult(modelMap, user);
    }

    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseData accountValid(@RequestBody User user) {
        log.info(user.toString());
        boolean res = userService.accountValid(user);
        return new ResponseData(res);
    }

    @ResponseBody
    @RequestMapping(value = "/new", method = RequestMethod.POST)
    public ResponseData insert(@RequestBody User user) {
        userService.insert(user);
        return new ResponseData(user);
    }

}

package webproject;

import com.weibo.dashboard.entity.User;
import com.weibo.dashboard.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-context.xml"})
public class UserTest {
    @Autowired
    private UserService userService;

    @Test
    public void testAdd() {
        User user = new User();
        user.setName("test");
        user.setPassword("testpd");
        int res = userService.insert(user);
        System.out.println(res);
    }

    @Test
    public void testAccountValid() {
        User user = new User();
        user.setName("test");
        user.setPassword("testpd");
        boolean res = userService.accountValid(user);
        System.out.println(res);
    }

}

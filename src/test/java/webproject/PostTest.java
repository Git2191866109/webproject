package webproject;

import com.weibo.dashboard.entity.Post;
import com.weibo.dashboard.service.PostService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-context.xml"})
public class PostTest {
    private static Logger log = LogManager.getLogger(PostTest.class.getName());
    @Autowired
    private PostService postservice;

    @Test
    public void testFindList() {
        log.info("哈哈......");
        List<Post> list = postservice.findList();
        for (Post post : list) {
            System.out.println(post.getAuthorName());
            if (post.getCommentList() != null) {
                System.out.println(post.getCommentList().get(0).getcContent());
            }
        }
    }

    @Test
    public void testAdd() {
        Post post = new Post();
        post.setAuthorName("wei");
        post.setDate(new Date());
        post.setContent("Sunny day");
        int res = postservice.insert(post);
        System.out.println(res);

    }
}

package webproject;

import com.weibo.dashboard.entity.Comment;
import com.weibo.dashboard.service.CommentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-context.xml"})
public class CommentTest {


	@Resource
	CommentService commentservice;
	/*@Test
	public void testFindList(){
		List<Post> list = commentservice.findList();
		for (Post post : list) {
			System.out.println(post.getAuthorName());
		}
	}*/
	@Test
	public void testAdd(){
		Comment comment = new Comment();
		comment.setcContent("good");
		comment.setcAuthorName("sommer");
		comment.setPostId(2);
		int res = commentservice.insert(comment);
		System.out.println(res);

	}
}

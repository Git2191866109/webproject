package webproject.service_test;

import com.weibo.dashboard.dao.SysDicMapper;
import com.weibo.dashboard.entity.SysDic;
import com.weibo.dashboard.service.ISysDicService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

/**
 * Created by wei.ma on 2017/1/25.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-context.xml"})
public class SysDicTest {
    private static Logger log = LogManager.getLogger(SysDicTest.class.getName());
    @Autowired
    private ISysDicService sysDicService;
    @Autowired
    private SysDicMapper dicMapper;

    @Test
    public void testQueryDicAll() {
        log.info("测试单表没有配置文件的......查询所有");

    }


    @Test
    public void testQueryDicById() {
        log.info("测试单表没有配置文件的......查询");
        SysDic sysDic = sysDicService.queryDicById(1L);
        System.out.println(sysDic.toString());
    }

    @Test
    public void testInsertDic() {
        log.info("测试单表没有配置文件的......插入");
        SysDic sysDic = new SysDic();
        sysDic.setIndexId(12L);
        sysDic.setCode("test");
        sysDic.setCodeText("测试");
        sysDic.setSortNo(1);
        sysDic.setEditable(false);
        sysDic.setEnable(false);
        sysDic.setRemark(null);
        sysDic.setCreateBy(2L);
        sysDic.setUpdateBy(4L);
        sysDicService.updateDic(sysDic);
        System.out.println(sysDic.toString());
    }

    @Test
    public void testupdateDic() {
        log.info("测试单表没有配置文件的......更新");
        SysDic sysDic = new SysDic();
        sysDic.setId(824219512369897472L);
        sysDic.setIndexId(11L);
        sysDic.setCode("test");
        sysDic.setCodeText("测试ceshi");
        sysDic.setSortNo(8);
        sysDic.setEditable(false);
        sysDic.setEnable(false);
        sysDic.setRemark("remark");
        sysDic.setCreateBy(44L);
        sysDic.setUpdateBy(22L);
        sysDicService.updateDic(sysDic);
        System.out.println(sysDic.toString());
    }

    @Test
    public void testdeleteeDic() {
        log.info("测试单表没有配置文件的......删除");
        SysDic sysDic = new SysDic();
        sysDicService.deleteDic(824222166152175616L);

    }
}

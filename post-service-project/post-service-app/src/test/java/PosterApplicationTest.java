import cn.abmis.lightflow.postservice.PostServiceApplication;
import cn.abmis.lightflow.postservice.service.PosterService;
import cn.abmis.lightflow.postservice.service.bo.PosterBO;
import cn.abmis.lightflow.postservice.service.bo.PosterCreateBO;
import cn.abmis.lightflow.postservice.service.bo.PosterUpdateBO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = PostServiceApplication.class)
@RunWith(SpringRunner.class)
public class PosterApplicationTest {

    @Autowired
    private PosterService posterService;

    @Test
    public void testGetPoster() {
        System.out.println(posterService.getPoster(1));
    }

    @Test
    public void testAddPoster() {
        PosterCreateBO poster = new PosterCreateBO()
                .setAuthorId("111@qq.com")
                .setChannelId(321321)
                .setContent("321321321")
                .setTitle("title")
                .setType(0)
                .setUrl("www.baidu.com");
        PosterBO posterBO = posterService.addPoster(poster);
        System.out.println(posterBO);
    }

    @Test
    public void testUpdatePoster() {
        PosterUpdateBO poster = new PosterUpdateBO()
                .setId(1)
                .setContent("111111")
                .setUrl("www.mi.com");
        posterService.updatePoster(poster);
        System.out.println("updated");
    }

}

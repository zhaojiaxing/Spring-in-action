import com.zjx.xml.MediaPlayer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by zjx on 2018/6/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:pxmlconfig.xml")
public class PBlankDiscTest {

    @Autowired
    private MediaPlayer player;

    @Test
    public void play() {
        player.play();
    }

}

import com.zjx.externals.BlankDisc;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by zjx on 2018/6/7.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = com.zjx.externals.BlankDiscConfig.class)
public class SpELTest {
    @Autowired
    private BlankDisc blankDisc;



    @Test
    public void test(){
        System.out.println("title:"+blankDisc.getTitle()+" artist:"+blankDisc.getArtist());
    }

}

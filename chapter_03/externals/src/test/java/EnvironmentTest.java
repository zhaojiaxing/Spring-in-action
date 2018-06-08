import com.zjx.externals.BlankDisc;
import com.zjx.externals.EnvironmentConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by zjx on 2018/6/6.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = EnvironmentConfig.class)
public class EnvironmentTest {
    @Autowired
    private BlankDisc blankDisc;

    @Test
    public void test(){
        System.out.println( blankDisc.getArtist());
    }
}

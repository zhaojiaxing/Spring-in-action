import com.zjx.aspectj.ConcertConfig;
import com.zjx.aspectj.Performance;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by zjx on 2018/6/20.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ConcertConfig.class})
public class AudienceTest {
    @Autowired
    public Performance performance;

    @Test
    public void test(){
        performance.perform();
    }
}

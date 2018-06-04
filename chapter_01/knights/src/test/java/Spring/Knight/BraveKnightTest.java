package Spring.Knight;
import org.junit.Test;
import spring.knights.BraveKnight;
import spring.knights.Quest;

import static org.mockito.Mockito.*;

/**
 * Created by zjx on 2018/5/31.
 */
public class BraveKnightTest {

    @Test
    public void knightShouldEmarkOnQuest(){
        Quest mockQuest = mock(Quest.class);
        BraveKnight knight = new BraveKnight(mockQuest);
        knight.embarkOnQuest();
        verify(mockQuest,times(1)).embark();
    }
}

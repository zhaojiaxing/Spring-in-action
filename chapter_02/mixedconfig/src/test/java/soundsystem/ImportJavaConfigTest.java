package soundsystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import sounds.MediaPlayer;
import sounds.config.SoundSystemConfig;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:cdplayer-config.xml")
@ContextConfiguration(classes = SoundSystemConfig.class)
public class ImportJavaConfigTest {


  @Autowired
  private MediaPlayer player;


  @Test
  public void play() {
    player.play();
  }

}

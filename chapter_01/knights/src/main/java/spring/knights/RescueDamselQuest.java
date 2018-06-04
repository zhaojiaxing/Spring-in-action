package spring.knights;

/**
 * 救援少女
 * Created by zjx on 2018/5/31.
 */
public class RescueDamselQuest implements Quest {
    /**
     * 开始救援
     */
    @Override
    public void embark() {
        System.out.println("开始了营救少女的行动。");
    }
}

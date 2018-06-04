package spring.knights;

/**
 * 救援少女的骑士
 * Created by zjx on 2018/5/31.
 */
public class DamselRescuingKnight implements Knight {
    /**
     * 救援少女
     */
    private RescueDamselQuest quest;

    public DamselRescuingKnight(){
        this.quest = new RescueDamselQuest();
    }
    @Override
    public void embarkOnQuest() {
        quest.embark();
    }
}

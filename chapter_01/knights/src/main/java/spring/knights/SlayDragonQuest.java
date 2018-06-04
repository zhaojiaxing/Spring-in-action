package spring.knights;

import java.io.PrintStream;

/**
 * Created by zjx on 2018/6/1.
 */
public class SlayDragonQuest implements Quest {

    private PrintStream printStream;

    public SlayDragonQuest(PrintStream printStream){
        this.printStream = printStream;
    }

    @Override
    public void embark() {
        printStream.println("探险任务是去屠龙");
    }

}

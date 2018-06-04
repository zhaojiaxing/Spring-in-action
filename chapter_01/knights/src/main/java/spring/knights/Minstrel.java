package spring.knights;

import java.io.PrintStream;

/**
 * 吟游诗人
 * Created by zjx on 2018/6/1.
 */
public class Minstrel {

    private PrintStream stream;

    public Minstrel(PrintStream stream){
        this.stream = stream;
    }

    //探险之前调用
    public void singBeforeQuest(){
        stream.println("阿法拉，骑士是如此的勇敢");
    }

    public void singAfterQuest(){
        stream.println("勇敢的骑士开始了一项探索");
    }

}

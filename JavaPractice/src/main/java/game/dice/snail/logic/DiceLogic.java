package JavaPractice.src.main.java.game.dice.snail.logic;

import JavaPractice.src.main.java.game.dice.snail.status.bean.Status;

public class DiceLogic {
    public int howgoing(int firstdice,int secondsdice){
        int howgoing=0;
        Status status = new Status();

        howgoing=firstdice+secondsdice;
        System.out.println("["+firstdice+"]["+secondsdice+"]" +"---> [["+howgoing+"]]");
        return howgoing;
    }
}





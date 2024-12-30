package game.dice.snail.logic;

import game.dice.snail.status.Status;

public class DiceLogic {
    public int howgoing(int firstdice,int secondsdice){
        int howgoing=0;
        Status status = new Status();

        howgoing=firstdice+secondsdice;
        System.out.println("["+firstdice+"]["+secondsdice+"]" +"---> [["+howgoing+"]]");
        return howgoing;
    }
}





package main;
import interfaces.Hand;
import interfaces.Head;
import interfaces.Leag;
import interfaces.Robot;

public class ModelT1000 extends Robot{
    Head head;
    Hand hand;
    Leag leag;
    
    public ModelT1000(Head head, Hand hand, Leag leag){
        super();
        this.head = head;
        this.leag = leag;
        this.hand = hand;
    }
    
    public ModelT1000(){
        
    }
    
    @Override
    public void action() {
        head.thinking();
        hand.catchSomeThing();
    }

    @Override
    public void dance() {
        head.thinking();
        leag.run();
        System.out.println("dancing!!");
    }

}

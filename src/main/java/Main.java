import entity.MessageTask;
import service.StrategyTaskRunner;
import utils.Strategy;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args){
        if(args.length==0)
        {
            System.out.println("nu sunt parametrii");
            return;
        }

        MessageTask m1 = new MessageTask("1","Descriere1","Mesaj1","From1", "To1",
                LocalDateTime.of(2019,10,2,12,00));
        MessageTask m2 = new MessageTask("2","Descriere2","Mesaj2","From2", "To2",
                LocalDateTime.of(2019,10,2,12,00));

        Strategy strategy = Strategy.valueOf(args[0]);
        StrategyTaskRunner runner = new StrategyTaskRunner(strategy);
        runner.addTask(m1);
        runner.addTask(m2);
        runner.executeAll();
    }
}









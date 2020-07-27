package service;

import entity.Task;
import repository.Container;
import utils.Strategy;

public class StrategyTaskRunner implements TaskRunner {
    private Container c;
    public StrategyTaskRunner(Strategy s) {
        StrategyTaskContainer x = new StrategyTaskContainer();
        c=x.createContainer(s);
    }

    @Override
    public void executeOneTask() {
        if(!c.isEmpty()){
            Task t=c.remove();
            ((Task) t).execute();
        }
    }

    @Override
    public void executeAll() {
        while(hasTask()) {
            executeOneTask();
        }
    }

    @Override
    public void addTask(Task t) {
        c.add(t);
    }

    @Override
    public boolean hasTask() {
        return !c.isEmpty();
    }
}

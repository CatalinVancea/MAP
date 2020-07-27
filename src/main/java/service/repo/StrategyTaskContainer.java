package service.repo;

import repository.Container;
import repository.ContainerLifo;
import repository.StackContainer;
import utils.Strategy;

public class StrategyTaskContainer implements Factory {
    public Container createContainer(Strategy s) {
        if (s == Strategy.LIFO)
            return new ContainerLifo();
        else
            return new StackContainer();
    }
}

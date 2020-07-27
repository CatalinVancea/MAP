package service;

import repository.Container;
import repository.ContainerFifo;
import repository.StackContainer;
import utils.Strategy;

public class StrategyTaskContainer implements Factory {
    public Container createContainer(Strategy s) {
        if (s == Strategy.FIFO)
            return new ContainerFifo();
        else
            return new StackContainer();
    }
}

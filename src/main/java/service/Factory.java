package service;

import repository.Container;
import utils.Strategy;

public interface Factory {
    public Container createContainer(Strategy s);
}

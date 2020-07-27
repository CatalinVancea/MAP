package repository;


import entity.Task;

/**
 * Interfata Container
 */
public interface Container{
    public Task remove();
    public void add(Task t);
    public int size();
    public boolean isEmpty();
}


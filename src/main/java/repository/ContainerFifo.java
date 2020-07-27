package repository;

import entity.Task;

public class ContainerFifo implements Container {
    private Task[] tasks;
    private int size;

    public ContainerFifo(){
        tasks=new Task[10];
        size=0;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(Task other) {
        if (size == tasks.length){
            tasks[size]=other;
            size++;
        }
    }

    @Override
    public Task remove(){
        if(isEmpty()==true) {
            return null;
        }
        else {
            Task firstTask = tasks[0];
            for(int i=0; i<(size-1); i++)
                tasks[i] = tasks[i+1];
            size--;
            return firstTask;
        }
    }
}
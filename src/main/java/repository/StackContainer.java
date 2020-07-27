package repository;

import entity.Task;

public class StackContainer implements Container {
    private Task[] tasks;
    private int size;

    public StackContainer(){
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
        if (size < tasks.length){
            tasks[size]=other;
            size++;
        }
    }

    @Override
    public Task remove(){
        if(isEmpty()) {
            return null;
        }
        else {
            size--;
            Task lastTask = tasks[size];
            tasks[size]=null;
            return lastTask;
        }
    }

    private void resize(){
        if(size >= tasks.length) {
            Task newTasks[]=new Task[size*2];
            for(int i=0;i<size;i++)
                newTasks[i]=tasks[i];
            tasks=newTasks;
            size=size*2;
        }
    }
}
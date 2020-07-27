package service;

import entity.Task;

public abstract class AbstractTaskRunner implements TaskRunner {
    private TaskRunner runner;
    public void AbstractTaskRunner(TaskRunner t) {
        runner = t;
    }
    public void executeOneTask(){
        runner.executeOneTask();
    }
    public void executeAll(){
        runner.executeOneTask();
    }
    public boolean hasTask(){
        return runner.hasTask();
    }
    public void addTask(Task t){
        runner.addTask(t);
    }
}

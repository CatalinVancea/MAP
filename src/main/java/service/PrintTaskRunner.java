package service;

public class PrintTaskRunner extends AbstractTaskRunner{


    public PrintTaskRunner(TaskRunner runner){
        super(runner);
    }

    @Override
    public void executeAll() {
        while(super.hasTask()) {
            executeOneTask();
        }
    }

    @Override
    public void executeOneTask() {
        System.out.print("PrintTaskRunner: ");
        super.executeOneTask();

    }
}

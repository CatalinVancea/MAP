import entity.MessageTask;
import entity.validator.MessageValidator;
import repository.AbstractRepository;
import repository.MessageTaskRepo;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args){

        MessageValidator messageValidator = new MessageValidator();

        AbstractRepository<String, MessageTask> repo=new MessageTaskRepo(messageValidator);
        MessageTask m1 = new MessageTask("1","Descriere1","Mesaj1","From1", "To1",
                LocalDateTime.of(2019,10,2,12,00));
        MessageTask m2 = new MessageTask("2","Descriere2","Mesaj2","From2", "To2",
                LocalDateTime.of(2019,10,2,12,00));
        repo.save(m1);
        repo.save(m2);
        for(MessageTask it: repo.findAll()){
            System.out.println(it);
        }
    }
}

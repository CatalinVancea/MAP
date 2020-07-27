package repository;

import entity.MessageTask;
import entity.validator.Validator;

public class MessageTaskRepo extends AbstractRepository<String, MessageTask> {
    public MessageTaskRepo(Validator<MessageTask> v1) {
        super(v1);
    }
}

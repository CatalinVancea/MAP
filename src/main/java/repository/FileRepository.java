package repository;

import entity.MessageTask;
import entity.validator.Validator;

public class FileRepository extends MessageTaskRepo {

    private  String fisier;

    public void loadFromFile(){

    }


    public FileRepository(String fisier1, Validator<MessageTask> v1) {
        super(v1);
        fisier=fisier1;
        loadFromFile();
    }
}

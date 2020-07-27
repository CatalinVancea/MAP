package entity.validator;

public interface Validator<E> {
    public void validate(E el) throws ValidatorException;
}

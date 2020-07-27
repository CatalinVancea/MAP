package repository;

import entity.Entity;
import entity.validator.Validator;
import entity.validator.ValidatorException;

import java.util.Map;
import java.util.TreeMap;

public abstract class AbstractRepository<ID, E extends Entity<ID>> implements Repository<ID,E> {
    protected Map<ID, E> m;
    protected Validator<E> v;
    public AbstractRepository(Validator<E> v1){
        v=v1;
        m=new TreeMap<>();
    }

    public void save(E elem){
        try{
            v.validate(elem);
            m.put(elem.getId(), elem);
        } catch (ValidatorException e) {
            e.printStackTrace();
        }
    }

    public E findOne(ID id){
        return m.get(id);
    }

    public void update(E e1, E e2){
        try{
            v.validate(e2);
            if(e1.getId().equals(e2.getId())){
                if(m.containsKey(e1.getId())){
                    m.put(e2.getId(),e2);
                }
            }
        }
        catch (ValidatorException e){
            System.out.println(e);
        }
    }

    public E delete(ID id){
        E el = m.get(id);
        if(el!=null){
            m.remove(id);
        }
        return el;
    }

    @Override
    public Iterable<E> findAll() {
        return m.values();
    }
}

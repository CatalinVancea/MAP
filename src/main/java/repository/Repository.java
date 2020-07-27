package repository;

import entity.Entity;

public interface Repository<ID, E extends Entity<ID>> {
    public void save(E el);
    public E findOne(ID id);
    public void update(E el, E new_el);
    public E delete(ID id);
    public Iterable<E> findAll();
}

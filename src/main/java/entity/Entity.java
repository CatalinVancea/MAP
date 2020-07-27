package entity;

public class Entity<ID> {
    protected ID id;
    public Entity(ID id1){
        id=id1;
    }
    public ID getId() {
        return id;
    }
    public void setId(ID id) {
        this.id = id;
    }
}

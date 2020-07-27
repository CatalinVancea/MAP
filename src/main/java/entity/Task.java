package entity;

/**
 * Definiti clasa abstracta Task avand atributele: taskID, descriere(string)
 * si metodele: un constructor cu parametrii, set/get, execute(abstracta), toString
 * Clasa Task este o clasa abstracta de baza care descrie entitatiile
 */
public abstract class Task extends Entity<String> {
    private String taskID;
    private String descriere;

    public Task(String taskID, String descriere) {
        super(taskID);
        this.taskID=taskID;
        this.descriere=descriere;
    }

    public int hashCode(){
        return id.hashCode();
    }

    public void setID(String taskID) {
        this.taskID=taskID;
    }

    public void setDescriere(String descriere) {
        this.descriere=descriere;
    }

    public String getID(){
        return this.taskID;
    }

    public String getDescriere() {
        return this.descriere;
    }

    public abstract void execute();

    public String toString(){
        return taskID + " " + descriere;
    }

    public boolean equals(Object object) {
        if( object instanceof Task){
            Task other=(Task)object;
            return (taskID.equals(other.getID()) && descriere.equals(other.descriere));
        }
        return false;
    }
}
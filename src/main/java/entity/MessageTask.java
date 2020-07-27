package entity;

import java.time.LocalDateTime;

/**
 * Derivati clasa MessageTask din clasa Task, avand atributele: mesaj, from, to(String), date(LocalDateTime) si afiseaza
 * pe ecran, via metoda execute(), textul mesajului si data la care a fost creat.
 */
public class MessageTask extends Task {
    private String message,from,to;
    private LocalDateTime date;
    public MessageTask(String taskID, String descriere, String message, String from, String to, LocalDateTime date){
        super(taskID, descriere);
        this.message=message;
        this.from=from;
        this.to=to;
        this.date=date;
    }

    public String getMessage() {
        return message;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public LocalDateTime getDate() {
        return date;
    }

    @Override
    public void execute(){
        System.out.println("The message was send: "+message+" "+date);
    }

    public String toString(){
        return super.toString()+" "+message+" "+from+" "+to+" "+date;
    }

    public boolean equals(Object object)
    {
        if(object instanceof MessageTask)
        {
            MessageTask other = (MessageTask)object;
            return other.getID().equals(this.getID());
        }
        return false;
    }
}
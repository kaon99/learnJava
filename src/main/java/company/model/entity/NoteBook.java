package company.model.entity;




import company.exception.UniqueLoginException;

import java.util.ArrayList;
import java.util.List;

public class NoteBook {

    public List<Notes> notebooksList = new ArrayList();

    public NoteBook() {
    }

    public void addtTestUsers() {
        notebooksList.add(new Notes( "Валя", "Джобс","kaon@gmail.com"));
        notebooksList.add(new Notes("Галя","Церно",  "k34on@gmail.com"));
        notebooksList.add(new Notes("Толя","Щербина",  "kafdgon@gmail.com"));
        notebooksList.add(new Notes("Маша","Журба",  "kavbnon@gmail.com"));
        notebooksList.add(new Notes("А", "А", "А"));


    }

    public void addToNotebookList(Notes note) {
        addtTestUsers();
        try {
            for (Notes i : notebooksList) {
                if (i.getName().equals(note.getName())) {
                    throw new UniqueLoginException("This login is already exist! ");
                }


            }
            notebooksList.add(note);
        } catch (UniqueLoginException e) {
            e.printStackTrace();
        }



    }

    public String showAllUsers() {
        StringBuilder sb = new StringBuilder();
        for (Notes i : notebooksList) {
            sb.append(i.getName() + " ");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return "NoteBook{" +
                "notebooksList=" + notebooksList +
                '}';
    }
}

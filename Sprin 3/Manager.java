import java.util.HashMap;
import java.util.ArrayList;

public class Manager {

    public static int identifier = 0;
    HashMap<Integer, Task> tasks = new HashMap<>();
    HashMap<Integer, Epic> epics = new HashMap<>();
    HashMap<Integer, Subtask> subtasks = new HashMap<>();

    //Методы для типа задач Task

    public ArrayList tasksList() {
        ArrayList <String> listName = new ArrayList<>();
        for (Task o : tasks.values()) {
            listName.add(o.getName());
        }
        return listName;
    }

    public void taskDelete() {
        tasks.clear();
    }

    public Task taskSearch(int id) {
        Task object = null;
        for(Task o : tasks.values()) {
            if (o.getIdentifier() == id) {
                object = o;
            }
        }
        return object;
    }

    public Task taskCreation(String name, String description) {
        identifier++;
        return new Task(name, description);
    }


    public void taskUpdate (Task task, int id) {
        tasks.put(id, task);
    }

    public void taskDelete (int id) {
        tasks.remove(id);
    }

    //Методы для типа задач Epic

    public ArrayList epicList() {
        ArrayList <String> listName = new ArrayList<>();
        for (Epic o : epics.values()) {
            listName.add(o.getName());
        }
        return listName;
    }

    public void epicDelete() {
        epics.clear();
    }

    public Epic epicSearch(int id) {
        Epic object = null;
        for(Epic o : epics.values()) {
            if (o.getIdentifier() == id) {
                object = o;
            }
        }
        return object;
    }

    public Epic epicCreation(String name, String description) {
        identifier++;
        return new Epic(name, description);
    }


    public void epicUpdate (Epic epic, int id) {
        epics.put(id, epic);
    }

    public void epicDelete (int id) {
        epics.remove(id);
    }

    public ArrayList epicListOfSubtask(Epic epic) {
        ArrayList <String> listNameSubtask = new ArrayList<>();
        for(Subtask o : epic.mySubtasks) {
            listNameSubtask.add(o.getName());
        }
        return listNameSubtask;
    }

    //Методы для типа задач Subtask

    public ArrayList <String> subtaskList() {
        ArrayList <String> listName = new ArrayList<>();
        for (Subtask o : subtasks.values()) {
            listName.add(o.getName());
        }
        return listName;
    }

    public void subtaskDelete() {
        subtasks.clear();
    }

    public Task subtaskSearch(int id) {
        Task object = null;
        for(Subtask o : subtasks.values()) {
            if (o.getIdentifier() == id) {
                object = o;
            }
        }
        return object;
    }

    public Subtask subtaskCreation(String name, String description, Epic epic) {
        identifier++;
        Subtask n = new Subtask(name, description, epic);
        epic.mySubtasks.add(n);
        epic.status = Status.IN_PROGRESS;
        return n;
    }


    public void subtaskUpdate (Subtask subtask, int id) {
        subtasks.put(id, subtask);
    }

    public void subtaskDelete (int id) {
        subtasks.remove(id);
    }

}



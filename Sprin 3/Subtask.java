
public class Subtask extends Task {

    Epic myEpic;

    public Subtask(String name, String description, Epic myEpic) {
        super(name, description);
        this.myEpic = myEpic;
    }

    @Override
    public void done() {
        status = Status.DONE;
        int i = 0;
        for (Subtask o : myEpic.mySubtasks){
            if (o.status == Status.DONE){
                i++;
            }
        }
        if (i == myEpic.mySubtasks.size()){
            myEpic.status = Status.DONE;
        }
    }
}


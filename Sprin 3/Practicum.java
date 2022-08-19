
public class Practicum {

    public static void main(String[] args) {

        Manager test = new Manager();

        Task nameTask1 = test.taskCreation("name", "meni text");
        test.taskUpdate(nameTask1, nameTask1.getIdentifier());
        System.out.println(test.tasksList().toString());

        Epic nameEpic1 = test.epicCreation("EpicName1", "meni text");
        test.epicUpdate(nameEpic1, nameEpic1.getIdentifier());
        System.out.println("Статус " + nameEpic1.status);
        System.out.println("Список подзадач" + test.epicListOfSubtask(nameEpic1));


        Subtask nameSubtask1 = test.subtaskCreation("Subtask1", "meni text", nameEpic1);
        test.subtaskUpdate(nameSubtask1, nameSubtask1.getIdentifier());
        System.out.println("Статус Эпика, после созданой подзадачи: "+ nameEpic1.status);

        Subtask nameSubtask2 = test.subtaskCreation("Subtask2", "meni text", nameEpic1);
        test.subtaskUpdate(nameSubtask2, nameSubtask2.getIdentifier());
        System.out.println("Список Эпиков: " + test.epicList().toString());

        System.out.println("Список подзадач у Эпика: " + test.epicListOfSubtask(nameEpic1));

        nameSubtask1.done();
        nameSubtask2.done();

        System.out.println("Статус Эпика, после завершения всех подзадач: "+ nameEpic1.status);

        test.subtaskDelete(nameSubtask1.getIdentifier());

        System.out.println("Псоле удаления Подзадачи1 :" + test.subtaskList().toString());













    }
}


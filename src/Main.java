import controller.TaskController;
import models.User;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        TaskController taskController=new TaskController();
        taskController.login("admin","1234");
        taskController.createTask("primera tarea","poner esto en marcha", LocalDate.now());

    }
}
import controller.TaskController;
import models.User;

public class Main {
    public static void main(String[] args) {

        TaskController taskController=new TaskController();
        System.out.println(taskController.createUser("lolo","123",2));
    }
}
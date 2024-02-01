import controller.TaskController;
import models.User;

public class Main {
    public static void main(String[] args) {
        User user= new User();
        System.out.println(user.login("lolo","1111").toString());

        TaskController taskController=new TaskController();

    }
}
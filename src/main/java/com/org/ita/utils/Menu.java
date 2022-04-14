package com.org.ita.utils;


public class Menu {
    private final ConsoleScanner scanner = new ConsoleScanner();
    private final TaskRunner taskRunner = new TaskRunner();

    public boolean run() {
        int choice;
        do {
            while (true) {
                try {
                    showMenu();
                    choice = scanner.readInt();
                    if (choice == 0) {
                        System.out.println("Good Bye!");
                        return false;
                    }
                    if (choice < 0 || choice > 3) {
                        throw new Exception();
                    }
                    break;
                } catch (Exception e) {
                    System.out.println("Data incorrect, try again");
                }
            }
            switch (choice) {
                case 1:
                    System.out.println("List of users:");
                    for (Users user : Users.values()) {
                        System.out.println(String.format("%s - %s", user.getId(), user.getFullName()));
                    }

                    System.out.println();
                    int user_id = scanner.readInt();
                    if (user_id < 1 || user_id >8) {
                        System.out.println("No such user, try again\n");
                        break;
                    }
                    Users users = Users.getById(user_id);
                    taskRunner.setUser(users);

                case 2:
                    System.out.println("List of tasks:");
                    SetTask s1 = new SetTask();
                    for (Tasks task : Tasks.values()) {
                        System.out.println(String.format("%s - %s", task.getId(), task.getTaskName()));
                    }
                    System.out.println();
                    int taskId = scanner.readInt();

                    if (taskId < 1 || taskId >24) {
                        System.out.println("Entered value not belongs to range ( 1-24 ) , or chosen task not added yet \n");
                        break;
                    }
                    s1.setTask(taskId);

            }

        } while (choice != 0);
        System.out.println("The program is finished!");
        return true;
    }

    public void showMenu() {
        System.out.println("1 - set user");
        System.out.println("2 - run task");
        System.out.println("0 - Exit.");
    }
}

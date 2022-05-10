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
                    try {
                        int user_id = scanner.readInt();
                        Users users = Users.getById(user_id);
                        taskRunner.setUser(users);
                    }catch (NullPointerException e){
                        System.out.println("No such user, try again\n");
                        break;
                    }
                    break;
                case 2:
                    System.out.println("List of tasks:");
                    for (Tasks task : Tasks.values()) {
                        System.out.println(String.format("%s - %s", task.getId(), task.getTaskName()));
                    }
                    System.out.println();
                    int taskId = scanner.readInt();
                    taskRunner.runTask(taskId);
                    break;
            }

        } while (choice != 0);
        return true;
    }

    public void showMenu() {
        System.out.println("1 - set user");
        System.out.println("2 - run task");
        System.out.println("0 - Exit.");
    }
}

package com.org.ita.utils;

public class Menu {
    private final ConsoleScanner scanner = new ConsoleScanner();
    private final TaskRunner taskRunner = new TaskRunner();

    public void run() {
        int choice;
        do {
            showMenu();
            choice = scanner.readInt();
            switch (choice) {
                case 1:
                    System.out.println("List of users:");
                    for (Users user : Users.values()) {
                        System.out.println(String.format("%s - %s", user.getId(), user.getFullName()));
                    }
                    System.out.println();
                    int user_id = scanner.readInt();
                    Users users = Users.getById(user_id);

                    taskRunner.setUser(users);
                case 2:
                    SetTask s1 = new SetTask();
                    System.out.println("List of tasks:");
                    for (Tasks task : Tasks.values()) {
                        System.out.println(String.format("%s - %s", task.getId(), task.getTaskName()));
                    }
                    System.out.println();
                    int taskId = scanner.readInt();
                    s1.setTask(taskId);
                    
            }

        } while (choice != 0);
    }

    public void showMenu() {
        System.out.println("1 - set user");
        System.out.println("2 - run task");
        System.out.println("0 - Exit.");
    }
}

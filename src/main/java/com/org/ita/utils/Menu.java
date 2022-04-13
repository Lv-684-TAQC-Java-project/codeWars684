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
                    //  System.out.println();
                    int user_id = scanner.readInt();
                    Users users = Users.getById(user_id);
                    taskRunner.setUser(users);
            }

        } while (choice != 0);
    }

    public void showMenu() {
        System.out.println("1 - set user");
        System.out.println("2 - run task");
        System.out.println("0 - Exit.");
    }
}

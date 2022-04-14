package com.org.ita.utils;


public class Menu {
    private final ConsoleScanner scanner = new ConsoleScanner();
    private final TaskRunner taskRunner = new TaskRunner();

    public boolean run() {
        int choice;
        do {
            showMenu();
            choice = scanner.readInt();
            while (true) {
                try {
                    showMenu();
                    @@ -32,12 +35,14 @@ public boolean run() {

                        System.out.println();
                        int user_id = scanner.readInt();
                        Users users = Users.getById(user_id);
                        taskRunner.setUser(users);
                        if (user_id < 1 || user_id >8) {
                            System.out.println("No such user, try again\n");
                            break;
                        }
                        Users users = Users.getById(user_id);
                        taskRunner.setUser(users);
                        System.out.println("No such user, try again\n");
                        break;
                    }
                    Users users = Users.getById(user_id);
                    taskRunner.setUser(users);

                    case 2:
                        System.out.println("List of tasks:");

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

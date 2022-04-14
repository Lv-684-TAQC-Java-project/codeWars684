package com.org.ita.utils;

public class SetTask {
    public void setTask(int scanner) {
        TaskRunner t1 = new TaskRunner();
        switch (scanner) {
            case 2:
                t1.task_8_2();
//                    break;
//                case 3:
//                    t1.task_8_3();
//                    break;
//                case 4:
//                    t1.task_8_4();
//                    break;
//                case 5:
//                    t1.task_8_5();
                break;
            case 6:
               // t1.task_8_6();
                break;
            case 7:
              //  t1.task_8_7();
                break;
//                case 8:
//                    t1.task_8_8();
//                    break;
//                case 9:
//                    t1.task_8_9();
//                    break;
//                case 10:
//                    t1.task_7_1();
//                    break;
//                case 11:
//                    t1.task_7_2();
//                    break;
//                case 12:
//                    t1.task_7_3();
//                    break;
            case 13:
              //  t1.task_6_1();
                break;
            case 14:
              //  t1.task_6_2();
                break;
//                case 15:
//                    t1.task_6_3();
//                    break;
//                case 16:
//                    t1.task_6_4();
//                    break;
//                case 17:
//                    t1.task_6_5();
//                    break;
//                case 18:
//                    t1.task_6_6();
//                    break;
//                case 19:
//                    t1.task_5_1();
//                    break;
//                case 20:
//                    t1.task_5_2();
//                    break;
//                case 21:
//                    t1.task_5_3();
//                    break;
//                case 22:
//                    t1.task_5_4();
//                    break;
//                case 23:
//                    t1.task_5_5();
//                    break;
//                case 24:
//                    t1.task_5_6();
//                    break;
            default:
                System.out.println("Entered value not belongs to range ( 1-24 ) , or chosen task not added yet ");
                System.exit(3);
        }
    }
}

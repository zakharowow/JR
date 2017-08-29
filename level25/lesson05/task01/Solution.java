package com.javarush.test.level25.lesson05.task01;

/* Switch для нитей
Обработайте список нитей в зависимости от состояния:
1. Если нить еще не запущена, то запустите ее.
2. Если нить в ожидании, то прервите ее.
3. Если нить работает, то проверить маркер isInterrupted.
4. Если нить прекратила работу, то выведите в консоль ее приоритет.
Используйте switch.
*/
public class Solution {
    public static void processThreads(Thread... threads) {
        for (Thread x : threads) {

            switch (x.getState()) {
                case NEW:
                    x.start();
                    break;
                case RUNNABLE:
                    x.isInterrupted();
                    break;
                case BLOCKED:
                    x.interrupt();
                    break;
                case WAITING:
                    x.interrupt();
                    break;
                case TIMED_WAITING:
                    x.interrupt();
                    break;
                case TERMINATED:
                    System.out.println(x.getPriority());
                    break;
            }
        }


        //implement this method - реализуйте этот метод
    }
}

package com.zsw;

/**
 * 3个线程轮流打印ABC
 */
public class SyncPrintABC {

    private static int i = 0;

    public static void main(String[] args) {
        Object lock = new Object();

        new Thread(() -> {
            while (true) {
                if (i > 10) {
                    break;
                }
                synchronized (lock) {
                    while (i % 3 != 0) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("A");
                    i++;
                    lock.notifyAll();
                }
            }
        }).start();

        new Thread(() -> {
            while (true) {
                synchronized (lock) {
                    if (i > 10) {
                        break;
                    }
                    while (i % 3 != 1) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("B");
                    i++;
                    lock.notifyAll();
                }
            }
        }).start();

        new Thread(() -> {
            while (true) {
                synchronized (lock) {
                    if (i > 10) {
                        break;
                    }
                    while (i % 3 != 2) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("C");
                    i++;
                    lock.notifyAll();
                }
            }
        }).start();
    }
}

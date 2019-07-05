package ua.zp.brain.labs.oop.basics.multithreading;

import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicLong;

class Race {
    public static AtomicLong startRaceTime;
    public static void main(String[] args) throws InterruptedException {
        final int distance = 500;
        CountDownLatch a = new CountDownLatch(4);
        ArrayList<RaceCarRunnable> cars = new ArrayList<>();
        cars.add(new RaceCarRunnable("VW", 254, distance,a));
        cars.add(new RaceCarRunnable("Ford", 230, distance,a));
        cars.add(new RaceCarRunnable("BMW", 280, distance,a));
        cars.add(new RaceCarRunnable("Mercedez", 270, distance,a));
        ArrayList<Thread> threads = new ArrayList<>();
        for (RaceCarRunnable car : cars) {
            threads.add(new Thread(car));
        }
        startRace(threads);
        a.await();
        for(RaceCarRunnable car: cars) System.out.println(car.getName()+" FINISHED");
    }
    static void startRace(List<Thread> cars) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("3...");
                    sleep(500);
                    System.out.println("2...");
                    sleep(500);
                    System.out.println("1...");
                    sleep(500);
                    System.out.println("GO!!!");
                    startRaceTime = new AtomicLong(System.currentTimeMillis());
                    for (Thread thr : cars) {
                        thr.start();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
    }
}

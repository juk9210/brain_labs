package ua.zp.brain.labs.oop.basics.multithreading;


import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadLocalRandom;

import static java.lang.Thread.sleep;

/**
 * @author Shakhov Yevhen.
 */

class RaceCarRunnable extends Car implements Runnable {
    private int passed;
    private int distance;
    private boolean isFinish;
    CountDownLatch latch ;

    public RaceCarRunnable(String name, int maxSpeed, int distance,CountDownLatch latch) {
        super(name, maxSpeed);
        this.distance = distance;
        this.latch = latch;
    }
    int getRandomSpeed(){
        return ThreadLocalRandom.current().nextInt((getMaxSpeed()/2),getMaxSpeed());
    }

    @Override
    public void run() {
        while(!isFinish){
            int currentSpeed = getRandomSpeed();
            try {
                sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            passed += (currentSpeed*1000/(60*60));
            System.out.println(getName()+ "=> speed: "+currentSpeed+"; progress: "+passed+"/"+distance);
            if(passed >= distance){
                isFinish=true;
                latch.countDown();
            }
        }
    }
}

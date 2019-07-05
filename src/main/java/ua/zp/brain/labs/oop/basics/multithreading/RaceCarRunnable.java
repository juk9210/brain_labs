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
    private long finishTime;

    public RaceCarRunnable(String name, int maxSpeed, int distance,CountDownLatch latch) {
        super(name, maxSpeed);
        this.distance = distance;
        this.latch = latch;
    }
    int getRandomSpeed(){
        return ThreadLocalRandom.current().nextInt((getMaxSpeed()/2),getMaxSpeed());
    }

    public int getPassed() {
        return passed;
    }

    public void setPassed(int passed) {
        this.passed = passed;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public boolean isFinish() {
        return isFinish;
    }

    public void setFinish(boolean finish) {
        isFinish = finish;
    }

    public CountDownLatch getLatch() {
        return latch;
    }

    public void setLatch(CountDownLatch latch) {
        this.latch = latch;
    }

    public long getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(long finishTime) {
        this.finishTime = finishTime;
    }

    @Override
    public void run() {
        while(!isFinish){
            finishTime = System.currentTimeMillis()-Race.startRaceTime.get();
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

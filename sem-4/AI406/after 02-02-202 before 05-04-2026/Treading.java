class Treading extends Thread {

    public void run() {
        System.out.println("Inside run() method");
        try {
            Thread.sleep(1000); // TIMED_WAITING state
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        Treading t1 = new Treading();

        // NEW state
        System.out.println("State after creating thread: " + t1.getState());

        // RUNNABLE state
        t1.start();
        System.out.println("State after calling start(): " + t1.getState());

        try {
            Thread.sleep(200); // Give time for thread to enter sleep
            System.out.println("State during sleep: " + t1.getState());

            t1.join(); // Wait for thread to finish

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // TERMINATED state
        System.out.println("State after completion: " + t1.getState());
    }
}
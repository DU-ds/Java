

class RunningOutOfTime extends Thread {
    public void run() {
        System.out.println("Hello Bellow");
    }

public static void main(String[] args) {
    RunningOutOfTime obj = new RunningOutOfTime();
    obj.start();
}
}


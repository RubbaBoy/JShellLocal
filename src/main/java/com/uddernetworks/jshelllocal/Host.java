package com.uddernetworks.jshelllocal;

import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * This is the "Host" program, AKA the main class that would be running, controlling the JVM.
 */
public class Host {

    // This must be a singleton
    public static Host host;

    private int counter = 0;

    public static void main(String[] args) {
        (host = new Host()).main();
    }

    private void main() {
        var shell = new JShellRemote();

        Executors.newSingleThreadScheduledExecutor().scheduleAtFixedRate(() -> {
            counter++;
            System.out.println("Counter = " + counter);
        }, 1, 5, TimeUnit.SECONDS);

        var scanner = new Scanner(System.in);
        for (String line; (line = scanner.nextLine()) != null;) {
            shell.runCode(line);
        }
    }

    public void addCounter() { // host.addCounter()
        counter += 10;
    }

    public void subCounter() { // host.subCounter()
        counter -= 10;
    }

    public void setCounter(int counter) { // host.setCounter(100)
        this.counter = counter;
    }

    public int getCounter() { // System.out.println("The current counter is: " + host.getCounter());
        return counter;
    }

}

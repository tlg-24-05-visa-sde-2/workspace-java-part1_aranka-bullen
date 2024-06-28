/*
* Client side main class, i.e the class definition with the main().
* That's the only thing that is in here.
 */
class AlarmClockClient {
    //starting point for every stand alone jave application.
    public static void main(String[] args) {

        //create an instance of AlarmClock
        //Left side: instance variable is named as a variable ( the reference point)
        //Right Side: instantiates the variable.

        AlarmClock clock1 = new AlarmClock();
        AlarmClock clock2 = new AlarmClock();
        AlarmClock clock3 = new AlarmClock();

        //clock1
        clock1.setSnoozeInterval(7); //accessor method needed to implement value to private field
        clock1.snooze();
        System.out.println();

        //clock2
        clock2.setSnoozeInterval(10);
        clock2.snooze();
        System.out.println();
        //clock3
        clock3.snooze();
        System.out.println(clock3.toString());

    }
}
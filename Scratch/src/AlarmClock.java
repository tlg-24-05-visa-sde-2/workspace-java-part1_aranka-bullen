/*
*Application class to model the workings of an AlarmClock.
*This class will not have a main() method. most classes do not.
*/

class AlarmClock {

        //attributes aka "instances variables/fields"
        int snoozeInterval=5; //set as default interval

        //constructors

        //methods
        void snooze(){
                System.out.printf("snoozing for %s minutes",snoozeInterval);
        }

}
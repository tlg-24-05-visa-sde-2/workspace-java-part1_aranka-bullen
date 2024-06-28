/*
*Application class to model the workings of an AlarmClock.
*This class will not have a main() method. most classes do not.
*/

class AlarmClock {

        //attributes aka "instances variables/fields"
        private int snoozeInterval=5; //set as default interval

        //constructors

        //methods
        public void snooze(){
                System.out.printf("snoozing for %s minutes",snoozeInterval);
        }

        //getters and setters (accessor methods)

        public int getSnoozeInterval() {
                return snoozeInterval;
        }

        //TODO: implement a constraint- must between 1 and 20(inclusive)
        //If incoming value "valid," we take it, i.e., assign to the private field
        //otherwise, we reject it with an error message

        public void setSnoozeInterval(int snoozeInterval) {

                if(snoozeInterval>0) {
                        this.snoozeInterval = snoozeInterval;
                }
                else {
                        throw new IllegalArgumentException("snoozeInterval must be greater than 0");
                }


        }

        public String toString() {
                return String.format("\n AlarmClock: snoozeInterval= %s", getSnoozeInterval());
        }
}
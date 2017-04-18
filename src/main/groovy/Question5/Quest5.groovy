package Question5

import groovy.transform.ToString

/**
 5b. Write a class HourMinute where the class stores hours and minutes as separate fields.
 Overload + and - operator operator for this class
 */
hour2 = new HourMinute(hours: 3,minutes: 2);
hour = new HourMinute(hours: 4,minutes: 4);
println hour2 + hour
println hour2 - hour

@ToString
class HourMinute {

    Integer hours;
    Integer minutes;

    HourMinute plus(HourMinute hourMinute){
        HourMinute hourMinute1 = new HourMinute();
        hourMinute1.hours = this.hours + hourMinute.hours;
        hourMinute1.minutes = this.minutes + hourMinute.minutes;
        hourMinute1
    }

    HourMinute minus(HourMinute hourMinute){
        HourMinute hourMinute1 = new HourMinute();
        hourMinute1.hours = this.hours - hourMinute.hours;
        hourMinute1.minutes = this.minutes - hourMinute.minutes;
        hourMinute1
    }
}

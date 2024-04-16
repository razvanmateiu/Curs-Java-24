package curs.curs25.TeamWork;

public enum Day {
    MONDAY(false),
    TUESDAY(false),
    WEDNESDAY(false),
    THUSDAY(false),
    FRIDAY(false),
    SATURDAY(true),
    SUNDAY(true);

    private boolean isWeekEndDay;
    public boolean isWeekEndDay(){
        return isWeekEndDay;
    }

    Day(boolean isWeekEndDay){
        this.isWeekEndDay=isWeekEndDay;
    }
}

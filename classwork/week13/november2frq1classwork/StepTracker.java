public class StepTracker{
    //instance variables
    private int activeSteps;
    private int activeDays = 0;
    private int totalSteps = 0;
    private int numOfDays = 0;

    //constructor to set what amount of step is considered active
    public StepTracker(int activeSteps){
        this.activeSteps = activeSteps;
    }

    //adds the steps for the days, updating active days, total steps, and number of days
    public void addDailySteps(int steps){
        totalSteps += steps;
        numOfDays++;
        if (steps >= activeSteps){
            activeDays++;
        }
    }

    //returns the number of active days
    public int activeDays(){
        return activeDays;
    }

    //checks of there is zero days logged, else returns the average steps
    public double averageSteps(){
        if (numOfDays == 0){
            return 0;
        }
        return ((double) totalSteps / numOfDays);
    }
}
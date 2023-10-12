public class Team {
    // TODO: Declare private fields - name, wins, losses
    private static String name;
    private static int wins;
    private static int losses;


    // TODO: Define mutator methods -
    //       setName(), setWins(), setLosses()
    public void setName(String teamName) {
        name = teamName;
    }

    public void setWins(int teamWins) {
        wins = teamWins;
    }

    public void setLosses(int teamLosses) {
        losses = teamLosses;
    }

    //-------------------------------------------------------------------------------------------------------------//
    // TODO: Define accessor methods -
    //       getName(), getWins(), getLosses()
    public static String getName() {
        return name;
    }

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return losses;
    }


    // TODO: Define getWinPercentage()
    public static double getWinPercentage() {
        double winPercentage = (double) wins / (wins + losses);

        return winPercentage;
    }

    // TODO: Define printStanding()
    public static void printStanding() {
        double winPercentage = getWinPercentage();

        System.out.println("Win percentage: " + String.format("%.2f", winPercentage));
        if (winPercentage >= .5) {
            System.out.println("Congratulations, Team " + getName() + " has a winning average!");
        } else {
            System.out.println("Team " + getName() + " has a losing average.");
        }

    }

}

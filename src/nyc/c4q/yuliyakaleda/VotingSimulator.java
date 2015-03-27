package nyc.c4q.yuliyakaleda;

/**
 * C4Q, AccessCode
 * Yuliya Kaleda
 * Election Simulator
 * Created 3/24/15
 */

public class VotingSimulator {

    public static void main(String[] args) {
        //create an election object
        Election president = new Election ("President");

        //create contender objects
        Contender contender1 = new Contender ("Yuliya");
        Contender contender2 = new Contender ("Harry");
        Contender contender3 = new Contender ("Alex");

        //add contenders to the created election objects
        president.add(contender1);
        president.add(contender2);
        president.add(contender3);

        //create a manager object
        ElectionManager manager = new ElectionManager();

        //manage the created election object
        manager.manage(president);

        //start polling
        manager.initiatePolling();

        //show results
        manager.displayResults();

    }
}

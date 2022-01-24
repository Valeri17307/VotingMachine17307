import java.util.*;

public class VoteMachine {
    private HashMap<Integer,Party> parties;

    public VoteMachine(HashMap<Integer,Party> parties) {
        this.parties = parties;
    }

    public void selectParty(){
        System.out.println("Please select party !");
        showParties();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your choice");
        int n = scanner.nextInt();
    }

    public void showParties(){
        for (var name: parties.keySet()) {
            String key = name.toString();
            String value = parties.get(name).toString();
            System.out.println(value);
        }
    }
}
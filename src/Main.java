import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Person> people = new ArrayList<Person>();
        people.add(new Person("Ivan", "Stoikov", 20, "3125"));
        people.add(new Person("Boyan", "Nikolov", 42, "8314"));
        people.add(new Person("Aleksandar", "Mladenov", 19, "2694"));
        people.add(new Person("Vasil", "Ivanov", 25, "4564"));
        people.add(new Person("Aleksei", "Borisov", 18, "5345"));

        ArrayList<Party> parties = new ArrayList<Party>();
        parties.add(new Party("GERB", 1));
        parties.add(new Party("BSP", 2));
        parties.add(new Party("ITN", 3));
        parties.add(new Party("NBC", 4));

        while (true) {
            System.out.println("1. Vote");
            System.out.println("2. Print people");
            System.out.println("3. Print parties");
            System.out.println("4. Exit");

            int option = Integer.parseInt(scan.nextLine());
            if (option == 1) {
                System.out.print("Enter user id: ");
                String uid = scan.nextLine();
                System.out.print("Enter party id: ");
                int pid = Integer.parseInt(scan.nextLine());
                for (Person p : people) {
                    if (p.getId().equals(uid)){
                        if (p.isVoted()){
                            System.out.println("You have already voted!");
                        } else {
                            for (Party party : parties) {
                                if (party.getNumber() == pid){
                                    p.setVoted(true);
                                    party.setVote(party.getVote() + 1);
                                }
                            }
                        }
                    }
                }
            } else if (option == 2) {
                for (Person p : people) {
                    System.out.print(p.getFirstName() + " " + p.getLastName() + " ID = " + p.getId());
                    if (p.isVoted()) {
                        System.out.println(" - voted");
                    } else {
                        System.out.println(" - not voted");
                    }
                }
            } else if (option == 3) {
                for (Party p : parties) {
                    System.out.println(p.getName() + " - " + p.getVote() + " ID = " + p.getNumber());
                }
            } else if (option == 4) {
                break;
            } else {
                System.out.println("Invalid option! Try again...");
            }
            scan.nextLine(); // press enter
        }

    }
}
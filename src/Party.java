public class Party {
    private String name;
    private int number;
    private int vote;

    public Party(String name, int number) {
        this.setName(name);
        this.setNumber(number);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getVote() {
        return vote;
    }

    public void setVote(int vote) {
        this.vote = vote;
    }

    @Override
    public String toString() {
        return "Party name: " + this.name + " Number: " + this.number;
    }
}
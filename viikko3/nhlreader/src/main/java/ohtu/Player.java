package ohtu;

public class Player implements Comparable<Player> {
    private String name;
    private String nationality;
    private int assists;
    private int goals;
    private int penalties;
    private String team;
    private int games;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public String getNationality() {
        return nationality;
    }

    public int getGoals() {
        return goals;
    }

    public int getPoints() {
      return goals + assists;
    }

    @Override
    public int compareTo(Player p) {
      return p.getPoints() - this.getPoints();
    }

    @Override
    public String toString() {
        return name + "\t" + team + "\t" + goals + " + " + " = " + getPoints();
    }
      
}

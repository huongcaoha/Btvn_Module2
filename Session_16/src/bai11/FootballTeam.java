package bai11;

public class FootballTeam {
    private Integer id ;
    private String name ;
    private Integer numberOfPlayer ;
    private Integer score ;

    public FootballTeam() {
    }

    public FootballTeam(Integer id, String name, Integer numberOfPlayer, Integer score) {
        this.id = id;
        this.name = name;
        this.numberOfPlayer = numberOfPlayer;
        this.score = score;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumberOfPlayer() {
        return numberOfPlayer;
    }

    public void setNumberOfPlayer(Integer numberOfPlayer) {
        this.numberOfPlayer = numberOfPlayer;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "FootballTeam{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", numberOfPlayer=" + numberOfPlayer +
                ", score=" + score +
                '}';
    }
}

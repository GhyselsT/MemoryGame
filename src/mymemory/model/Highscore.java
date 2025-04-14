package mymemory.model;

public class Highscore implements Comparable<Highscore> {
    private String name;
    private int score;

    public Highscore(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public int compareTo(Highscore o) {
        return o.score - this.score;
    }

    @Override
    public String toString() {
        return
                "name=" + name + '\t' +
                        "score=" + score;
    }
}

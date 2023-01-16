package ProblemSet8;

public class Book implements ToBeStored {
    private final String writer;
    private final String name;
    private final double weight;

    public Book(String writer, String name, double weight) {
        this.writer = writer;
        this.name = name;
        this.weight = weight;
    }
    @Override
    public double weight() {
        return weight;
    }

    @Override
    public String toString() {
        return  writer + ": " +
                name
                ;
    }
}
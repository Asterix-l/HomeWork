package homework;

import java.util.Comparator;

public class ScoreComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        return (int) (o1.getScores() - o2.getScores());
    }
}

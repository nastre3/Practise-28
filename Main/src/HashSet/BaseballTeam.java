package HashSet;

import java.util.Objects;

public class BaseballTeam {
    private String city;
    private String mascot;
    private int numberOfPlayers;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseballTeam that = (BaseballTeam) o;
        return city.equals(that.city) && mascot.equals(that.mascot);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, mascot);
    }
}

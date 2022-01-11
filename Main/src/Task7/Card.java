package Task7;

import java.util.Objects;

public class Card {
    public String type;
    public String value;

    public Card(String type, String value) {
        this.type = type;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return type.equals(card.type) && value.equals(card.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, value);
    }
}

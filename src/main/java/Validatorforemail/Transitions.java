package Validatorforemail;

public class Transitions {

    String from;
    String to;
    Character by;

    public Transitions(String from, String to, Character symbol) {
        this.from = from;
        this.to = to;
        this.by = symbol;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public Character getBy() {
        return by;
    }

    @Override
    public String toString() {
        return String.format("from:%s,by:%s,to:%s" + "\n", from, by, to);
    }
}

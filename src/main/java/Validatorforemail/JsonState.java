package Validatorforemail;

public class JsonState {

    private String id;
    private boolean finite;

    public JsonState(String id, boolean finite) {
        this.id = id;
        this.finite = finite;
    }

    public String getId() {
        return id;
    }

    public boolean isFinite() {
        return finite;
    }

    @Override
    public String toString() {
        return String.format("id:%s, finite:%s," + "\n", id, finite);
    }
}

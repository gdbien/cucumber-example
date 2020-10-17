package aninfo.model;

public class Door {
    private boolean is_open;

    public Door(boolean is_open) {
        this.is_open = is_open;
    }

    public void open() {
        is_open = true;
    }

    public boolean is_open() {
        return is_open;
    }

    public void close() {
        is_open = false;
    }
}

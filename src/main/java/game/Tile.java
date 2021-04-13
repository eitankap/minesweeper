package game;

public interface Tile {
    /**
     * State that the Tile is in.
     */
    public enum State {
        COVERED,
        UNCOVERED,
        FLAGGED
    }

    /**
     * Dig in this spot. Will explode if there is a bomb.
     *
     * @return true if there was a bomb.
     */
    public boolean Uncover();
    public void Flag();
    public String Print();
}
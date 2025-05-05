package section9moreoop;

/**
 * Interface representing objects that can move.
 * Classes implementing this interface must provide a move() method
 * that returns a String describing the movement.
 */
public interface IMovable {
    /**
     * Returns a description of how the object moves
     *
     * @return a String describing the movement
     */
    String move();
}

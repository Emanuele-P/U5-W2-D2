package ep2024.u5w2d2.exceptions;

public class NotFoundException extends RuntimeException {
    public NotFoundException(int id) {
        super("Element with id " + id + " not found :(");
    }
}

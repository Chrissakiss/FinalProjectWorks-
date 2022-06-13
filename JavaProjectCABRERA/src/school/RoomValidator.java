package school;
import util.IntValidator;

public class RoomValidator implements IntValidator {
    @Override
    public boolean accept(int roomNumber) {
        return roomNumber >= 100;
    }
}

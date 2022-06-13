package school;
import util.IntValidator;

public class IdValidator implements IntValidator {
    @Override
    public boolean accept(int studentId) {
        return studentId > 0;
    }
}

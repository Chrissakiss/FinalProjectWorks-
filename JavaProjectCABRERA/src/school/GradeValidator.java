package school;
import util.IntValidator;

public class GradeValidator implements IntValidator {
    @Override
    public boolean accept(int finalGrade) {
        return finalGrade >= 0 && finalGrade <= 100;
    }
}

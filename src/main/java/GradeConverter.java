
public class GradeConverter {
    private final int MAX_CORE = 100;
    private final int MIN_CORE = 0;
    private final int MIN_A_CORE = 90;
    private final int MIN_B_CORE = 80;
    private final int MIN_C_CORE = 70;
    private final int MIN_D_CORE = 60;
    private final int MIN_E_CORE = 0;

    public String convert(final int score) {
        if ((score > MAX_CORE) || (score < MIN_CORE)) {
            return "Invalid";
        } else if(score >= MIN_A_CORE) {
            return "A";
        } else if(score >= MIN_B_CORE) {
            return "B";
        } else if(score >= MIN_C_CORE){
            return "C";
        } else if(score >= MIN_D_CORE) {
            return "D";
        } else if(score >= MIN_E_CORE) {
            return "E";
        } else {
            return "Invalid";
        }
    }
}

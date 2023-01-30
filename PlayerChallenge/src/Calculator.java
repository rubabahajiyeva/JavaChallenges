public class Calculator {
    public static int newCalculator(int newScore) {
        if (newScore >= 1000) {
            return 1;
        } else if (newScore >= 500) {
            return 2;
        } else if (newScore >= 100) {
            return 3;
        } else {
            return 4;
        }

    }
}


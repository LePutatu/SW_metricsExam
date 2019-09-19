package sw.metrics.coverage;

public class PowerFunction {
    public static void main(String[] args) {
        System.out.println("radians "+Math.toRadians(0.01000964000003));
        System.out.println("degrees "+Math.toDegrees(1.747011749398488E-4));
    }

    public int power(String base, String exp) throws Exception {
        if (base == null) {
            throw new NullPointerException("base must not be null");
        }

        if (exp == null) {
            throw new NullPointerException("exp must not be null");
        }

        int baseInt = Integer.parseInt(base);
        int expInt = Integer.parseInt(exp);

        if (baseInt < 0 || expInt < 0) {
            throw new Exception("Method supports only positive integers");
        }

        return power(baseInt, expInt);
    }

    private int power(int base, int exp) {
        int result = 1;
        while (exp != 0) {
            if ((exp & 1) == 1)
                result *= base;
            exp >>= 1;
            base *= base;
        }
        return result;
    }

}

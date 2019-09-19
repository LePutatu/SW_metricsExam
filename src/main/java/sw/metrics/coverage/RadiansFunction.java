package sw.metrics.coverage;

public class RadiansFunction {
    private final double PI = 3.14159265358979323846;

    public double radians(String angle) throws Exception{
        if (angle == null) {
            throw new NullPointerException("base must not be null");
        }

        double baseDouble = Double.parseDouble(angle);

        if (baseDouble < 0 ) {
            throw new Exception("Method supports only positive integers");
        }
        return convertToRadians(baseDouble);
    }

    private double convertToRadians(double angle){
        return angle / 180.0 * PI;

    }
}

package griffith;

public class Conversions {
	public double euroToDollar(double euro) {
	    final double RATE = 1.10;
	    return euro * RATE;
	}

	public double dollarToEuro(double dollar) {
	    final double RATE = 1.10;
	    return dollar / RATE;
	}

	public int stringToInteger(String val) {
	    if (val == null) {
	        return 0;
	    }

	    try {
	        return Integer.parseInt(val);
	    } catch (NumberFormatException e) {
	        return 0;
	    }
	}

    public String integerToString(int val) {
        return null;
    }

    public String switchCase(String input) {
        return null;
    }
}

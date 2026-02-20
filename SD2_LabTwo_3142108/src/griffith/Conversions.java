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
	    return String.valueOf(val);
	}

	public String switchCase(String input) {
	    if (input == null) {
	        return null;
	    }

	    String result = "";

	    for (int i = 0; i < input.length(); i++) {
	        char ch = input.charAt(i);

	        if (Character.isUpperCase(ch)) {
	            result += Character.toLowerCase(ch);
	        } else if (Character.isLowerCase(ch)) {
	            result += Character.toUpperCase(ch);
	        } else {
	            result += ch;
	        }
	    }

	    return result;
	}
}

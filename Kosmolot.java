public class Kosmolot {

	public static void main(String[] args) {

		try {
			if (args.length != 2 || Integer.parseInt(args[0]) > 75 || Integer.parseInt(args[0]) < 0
					|| args[1].charAt(0) != 78 && args[1].charAt(0) != 89 || args[1].length() != 1) {
				System.out.println("klops");
				System.exit(0);
			}
		} catch (NumberFormatException e) {
			System.out.println("klops");
			System.exit(0);
		}
		if (args[1].charAt(0) == 78) {
			int height = Integer.parseInt(args[0]);
			char[] star = new char[height];
			String starstring, starstring2;
			for (int i = 0; i < star.length; i++) {
				star[i] = ' ';
			}
			for (int j = 0; j < star.length; j++) {
				star[j] = '*';
				starstring = new String(star);
				starstring2 = new String(star);
				for (int k = 1; k < star.length; k++) {
					starstring = starstring + starstring2;
				}
				System.out.println(starstring);
			}
			for (int i = 0; i < star.length; i++) {
				star[i] = '*';
			}
			for (int j = star.length - 1; j > 0; j--) {
				star[j] = ' ';
				starstring = new String(star);
				starstring2 = new String(star);
				for (int k = star.length; k > 1; k--) {
					starstring = starstring + starstring2;
				}
				System.out.println(starstring);

			}

		} else if (args[1].charAt(0) == 89) {
			int height = Integer.parseInt(args[0]);
			char[] star = new char[height];
			String starstring, starstring2;
			for (int i = 0; i < star.length; i++) {
				star[i] = ' ';
			}
			for (int j = 0; j < star.length; j++) {
				star[j] = '*';
				if (j == 0)
					star[j] = '>';

				starstring = new String(star);
				starstring2 = new String(star);

				for (int k = 1; k < star.length; k++) {
					starstring = starstring + starstring2;
				}

				System.out.println(starstring);
			}
			for (int i = 0; i < star.length; i++) {
				star[i] = '*';
				if (i == 0)
					star[i] = '>';
			}
			for (int j = star.length - 1; j > 0; j--) {
				star[j] = ' ';
				starstring = new String(star);
				starstring2 = new String(star);
				for (int k = star.length; k > 1; k--) {
					starstring = starstring + starstring2;
				}
				System.out.println(starstring);

			}
		}
	}

}

package exceptionsHomeWork;

public class Methods {

	int number_1 = 0;
	int number_2 = 0;
	int result = 0;

	public void operation() {

		System.out.println("Please enter first number");
		number_1 = User_Validator.scanner.nextInt();
		System.out.println("Enter operation");
		String operation = User_Validator.scanner.next();
		System.out.println("Please enter second number");
		number_2 = User_Validator.scanner.nextInt();
		if (operation.equalsIgnoreCase("+")) {
			showException();
			result = number_1 + number_2;
			System.out.println(result);
		} else if (operation.equalsIgnoreCase("-")) {
			showException();
			result = number_1 - number_2;
			System.out.println(result);
		} else if (operation.equalsIgnoreCase("*")) {
			showException();

			result = number_1 * number_2;
			System.out.println(result);

		} else if (operation.equalsIgnoreCase("/")) {
			showException();

			result = number_1 / number_2;
			System.out.println(result);

		}

	}

	public void showException() {
		try {
			if (number_1 < 0 && number_2 < 0) {
				throw new User_exception(ValidatorMessages.ILLIGAL_ARGUMENT_EXCEPTION);
			} else if (number_1 == 0 && number_2 != 0) {
				throw new User_exception(ValidatorMessages.ARITHMETICAL_EXCEPTION);
			} else if (number_1 != 0 && number_2 == 0) {
				throw new User_exception(ValidatorMessages.ARITHMETICAL_EXCEPTION);
			} else if (number_1 == 0 && number_2 == 0) {
				throw new User_exception(ValidatorMessages.ILLIGAL_ACCESS_EXCEPTION);
			} else if (number_1 > 0 && number_2 > 0) {
				throw new User_exception(ValidatorMessages.MY_EXCEPTION);
			}
		} catch (User_exception e) {
			System.out.println(e.getMessage());
		}
	}
}


package com.mphasis.DayThree;

import java.util.function.Predicate;

public class ValidateEmailUsingMR {

	public static boolean validatePassword(String password) {
		String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d).{8,}$";
		return password.matches(regex);
	}

	public static void main(String[] args) {

		Predicate<String> isValidPasswordMR = ValidateEmailUsingMR::validatePassword;

		System.out.println(isValidPasswordMR.test("Password1"));
		System.out.println(isValidPasswordMR.test("pass1"));

		Predicate<String> isValidPassword = pwd -> pwd.length() >= 8 && pwd.matches(".*[A-Z].*")
				&& pwd.matches(".*[a-z].*") && pwd.matches(".*\\d.*");

		System.out.println(isValidPassword.test("Passw1"));
		System.out.println(isValidPassword.test("pass1"));
	}
}

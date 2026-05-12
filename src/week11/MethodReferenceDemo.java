package week11;

import java.util.function.Supplier;

public class MethodReferenceDemo {
	public static double zero() {
		return 0.0;
	}
	
	public static void methodThatNeedsFunctionalInterface(Supplier<Double> doubleSupplier) {
		System.out.println(doubleSupplier.get());
	}
	public static void main(String[] args) {
		methodThatNeedsFunctionalInterface(Math::random);
		methodThatNeedsFunctionalInterface(MethodReferenceDemo::zero);
		methodThatNeedsFunctionalInterface(() -> 100.0);

        // Reference to an instance method of a particular object
        String name = "John";
        Supplier<Integer> secondSupplier = name::length;
		System.out.println(secondSupplier.get());
        String message = "Hello world!";
        secondSupplier = message::length;
        System.out.println(secondSupplier.get());
//
//
//        // Reference to a constructor
//
//        BiFunction<String, String, Account> myConstructor = Account::new;
//        Account myaccount = myConstructor.apply("s123", "Amy");
//        System.out.println(myaccount);
        
        
	}
}

  public class Functions {
 
public static int findMultiple(int number) {
	return number * 5;
}
public static void displayPrimeNumbers() {
	int counter = 0;
    for(int i = 2; ; i++) {
	int count = 0;
    for(int j = 1; j <= i; j++) {
	   if( i % j == 0) {
	    count++;
	  }
	  }
	 if(count == 2) {
	System.out.print(i + " ");
	  counter++;
	  }
	if(counter == 50) {
	  break;
}
}
}
public static String  displayAge(int ageYears) { 
 int months = ageYears * 12;
 int Days = ageYears * 365;
 long minutes =(long) Days * 24 * 60;
long seconds = minutes * 60;

 String result = "Age: "+ ageYears + " years(s), " + months +" months, " + Days +" Days, " + minutes +" minutes, "+ seconds +" seconds";
return result;
}
public static void displayDogAge(String name, int humanYears) {
        int dogYears = humanYears * 7;
        System.out.println(name + " is " + dogYears + " years old in dog years.");
    }
public static String findMultiplesOf7Not5() {
        String result = "";
        for (int number = 2000; number <= 3200; number++) {
            if (number % 7 == 0 && number % 5 != 0) {
                result += number + ", ";
            }
        }
        if (result.length() > 0) {
            return result.substring(0, result.length() - 1);
        } else {
            return result; 
        }
    }
public static int computeSumOfNumber(int number) {
  if(number > 9999) {
	System.out.print("invalid number");
	}
  	 int num1 = (number / 1000);
   	int num2 = (number / 100) % 10;
   	int num3 = (number / 10) % 10;
   	int num4 = (number % 10);
	return num1 + num2 + num3 + num4;
}

public static boolean isLeapYear(int year) {
	if(year % 400 == 0){
	return true;
	}
	if(year % 100 == 0){ 
	return false;
	}
	if(year % 4 == 0){
	return true;
	}
	return false;
}
  
}



	
	
package facebook.testLibrary;

import homeLibWithInt.HomeLibInteger;
import homeLibWithString.HomeLibString;

public class HowWorkMyLibrary {

    public static void main(String[] args) {

        HomeLibString libString = new HomeLibString();
        HomeLibInteger libInteger = new HomeLibInteger();
        int unicode = libString.unicodeOfString("String for test");
        System.out.println(unicode);

        String text = "Text for dell even element from this text.";
        System.out.println(libString.dellEvenElementOfString(text));

        String element = "elements";
        libString.printElementsOfChar(element);

        String analizText = "Sasha asha";
        char letter = 'a';
        System.out.println(libString.countSumOfLetter(analizText, letter));

        int salaryMounthes = 3;
        System.out.println(libInteger.countSalary(salaryMounthes));

        double costPresent = 12080.70;
        System.out.println(libInteger.countMoneyForPresent(costPresent));
    }
}

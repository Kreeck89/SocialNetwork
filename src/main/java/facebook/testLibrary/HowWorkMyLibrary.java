package facebook.testLibrary;

import homeLibWithInt.HomeLibInteger;
import homeLibWithScan.HomeLibScan;
import homeLibWithString.HomeLibString;

import java.util.Arrays;

public class HowWorkMyLibrary {

    public static void main(String[] args) {

        HomeLibString libString = new HomeLibString();
        HomeLibInteger libInteger = new HomeLibInteger();
        HomeLibScan libScan = new HomeLibScan();
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

        int arrayLength = 5;
        System.out.println(Arrays.toString(libScan.createArrayList(arrayLength)));
    }
}

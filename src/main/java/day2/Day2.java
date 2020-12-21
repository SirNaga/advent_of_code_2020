package day2;

import java.util.List;

public class Day2 {

    public static Integer getNumberOfInvalidPasswordsWithPolicie1(List<String> passwordList) {

        int minOccurences = 0;
        int maxOccurences = 0;
        char searchLetter;
        int validPasswords = 0;
        String password;

        for (String passwordLine : passwordList) {
            int occurence = 0;
            String[] tempArray;
            tempArray = passwordLine.split("-");
            minOccurences = Integer.valueOf(tempArray[0]);
            tempArray = tempArray[1].split(" ");
            maxOccurences = Integer.valueOf(tempArray[0]);
            searchLetter = tempArray[1].charAt(0);
            password = tempArray[2];
            char[] line = password.toCharArray();


            for (int i = 0; i < line.length; i++) {
                if (line[i] == searchLetter){
                    ++occurence;
                    if (occurence > maxOccurences){
                        break;
                    }

                }
            }

            if (occurence >= minOccurences && occurence <= maxOccurences){
                ++validPasswords;
            }
        }

        return validPasswords;
    }

    public static Integer getNumberOfInvalidPasswordsWithPolicie2(List<String> passwordList) {

        int firstOccurence = 0;
        int lastOccurences = 0;
        char searchLetter;
        int validPasswords = 0;
        String password;

        for (String passwordLine : passwordList) {
            int occurence = 0;
            String[] tempArray;
            tempArray = passwordLine.split("-");
            firstOccurence = Integer.valueOf(tempArray[0]);
            tempArray = tempArray[1].split(" ");
            lastOccurences = Integer.valueOf(tempArray[0]);
            searchLetter = tempArray[1].charAt(0);
            password = tempArray[2];
            char[] line = password.toCharArray();



        }

        return validPasswords;
    }

}

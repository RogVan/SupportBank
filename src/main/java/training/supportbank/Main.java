package training.supportbank;

import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String args[]) throws Exception {

        List<Account> allAccounts = new ArrayList<>();

        // map over the transactions

        // if this person exists

        // if this doesn't exist -> Add account allaccounts
        
        String name = "John a";
        String name1 = "Bob a";
        String name2 = "Sarah a";

        handleName("John a")
        handleName("Bob a")
        handleName("Sarah a")



//        String date = "2022/09/14";
//
//        LocalDate date1 = LocalDate.of(2022, 9, 14);

//        boolean running = true;
//
//
//
//        String file = Files.readString(Path.of("C:/Users/rogvan/OneDrive - Softwire Technology Limited/Desktop/binary.txt"));
//
//        while (running) {
////            System.out.println("enter your input here");
////            Scanner input = new Scanner(System.in);
////
//            Pattern pattern = Pattern.compile("(\\b@softwire\\.com\\b) | (\\b@softwire\\.co\\.uk\\b)", Pattern.CASE_INSENSITIVE);
//            Matcher matcher = pattern.matcher(file);
//
//            System.out.println(file.matches(pattern.pattern()));
////            System.out.println(file);
//
//            if (input.hasNext("exit")) {
//                running = false;
////                throw new Exception();
//            };

//            Pattern pattern = Pattern.compile("foo");
//            Matcher matcher = pattern.matcher("foo");
    }

    public void handleName(String inputtedName) {

        if (name == inputtedName) {
            // find account by inputtedName

            // Add amount to inputtedName

            // print adding amount to inputtedName
        }
    }
}

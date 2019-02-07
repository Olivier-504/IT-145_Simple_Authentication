package com.company;
import java.security.MessageDigest;
import java.util.Scanner;


public class Main {

    public static String promptUsername() {   //This method prompts the user for their username.
        Scanner scnr = new Scanner(System.in);
        System.out.println("Welcome!");
        System.out.println("Please enter your username: ");
        String prompt = scnr.nextLine();
        return prompt;
    }

    public static String promptUserPass() {   //This method prompts user for their password.
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please enter your password to proceed: ");
        String pass = scnr.nextLine();
        return pass;
    }

    public static String zooKeeperMSG() {  //This method controls the info displayed if a zookeeper account is accessed.
        String zooKeeper = "Hello Zookeeper!";
        String zooKeeper1 = "As zookeeper, you have access to all of the animals'" +
                " information and their daily monitoring logs. This allows you to" +
                " track their feeding habits, habitat conditions, and general welfare.";
        System.out.println(zooKeeper + "\n" + zooKeeper1);
        return zooKeeper + zooKeeper1;
    }

    public static String veterinarianMSG() {   //This method controls the info displayed if
        String veterinarian = "Hello, Veterinarian! ";   //a veterinarian account is accessed.
        String veterinarian1 = "As veterinarian, you have access to all of the animals' " +
                "health records. This allows you to view each animal's medical history " +
                "and current treatments/illnesses (if any), " +
                "and to maintain a vaccination log.";
        System.out.println(veterinarian + "\n" + veterinarian1);
        return veterinarian + veterinarian1;
    }

    public static String adminMSG() {   //This method controls the info displayed if an admin account is accessed.
        String admin = "Hello, System Admin! ";
        String admin1 = "As administrator, you have access to the zoo's main computer system.  " +
                "This allows you to monitor users in the system and their roles.\n";
        System.out.println(admin + "\n" + admin1);
        return admin + admin1;
    }

    public static String logout() {   // This method is called when it is time for a user to logout.
        Scanner scnr = new Scanner(System.in);
        String exit = "x";
        System.out.println("To logout, press x on your keyboard: ");
        String logOff = scnr.next();
        while (logOff.equals(exit)) {
            break;
        }
        return exit;
    }

    /*public static String credentials()   {   //Potential method that allows user to log off before signing in
        System.out.println("***Credentials Screen***");
        System.out.println("To logout, press x on your keyboard: ");
        Scanner scnr = new Scanner(System.in);
        String exit = "x";
        String logOff = scnr.next();
        while (logOff.equals(exit))   {
            break;
        }
        return exit;
    }*/

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scnr = new Scanner(System.in);  //Prepares for user input
        MD5Convert object = new MD5Convert();   //Creates new object from MD5Convert class
        int i = 0; //Variable used to control login attempts

        String userName1 = "griffin.keyes";
        String userPass1 = "alphabet soup";
        String userHashPass1 = "108de81c31bf9c622f76876b74e9285f";

        String userName2 = "rosario.dawson";
        String userPass2 = "animal doctor";
        String userHashPass2 = "3e34baa4ee2ff767af8c120a496742b5";

        String userName3 = "bernie.gorilla";
        String userPass3 = "secret password";
        String userHashPass3 = "a584efafa8f9ea7fe5cf18442f32b07b";

        String userName4 = "donald.monkey";
        String userPass4 = "M0nk3y business";
        String userHashPass4 = "17b1b7d8a706696ed220bc414f729ad3";

        String userName5 = "jerome.grizzlybear";
        String userPass5 = "grizzly1234";
        String userHashPass5 = "3adea92111e6307f8f2aae4721e77900";

        String userName6 = "bruce.grizzlybear";
        String userPass6 = "letmein";
        String userHashPass6 = "0d107d09f5bbe40cade3de5c71e9e9b7";


        for (i = 0; i <= 4; i++) {      //The for loop continuously asks for login credentials-
            String userEnteredName = promptUsername();   // -until three unsuccessful attempts have been made.
            if (userEnteredName.equals(userName1)) {     //The inner if-else statements compare both-
                object.lockUsername(userName1);          // -usernames and passwords. They check to see if the user-
                System.out.println("Welcome, " + object.getUsername());  // -entered password converts to-
                String userEnteredPass = promptUserPass();   // -the appropriate MD5 hash string-
                if (userEnteredPass.equals(userPass1)) {    // -then grants access.
                    object.lockPassword(userPass1);
                    MessageDigest md = MessageDigest.getInstance("MD5");
                    md.update(object.getPassword().getBytes());
                    byte[] digest = md.digest();
                    StringBuffer sb = new StringBuffer();
                    for (byte b : digest) {
                        sb.append(String.format("%02x", b & 0xff));
                    }
                    if (sb.toString().equals(userHashPass1)) {
                        System.out.println("Access Granted");
                        zooKeeperMSG();
                        logout();
                    }
                    break;
                }
            }
            else if (userEnteredName.equals(userName2)) {
                object.lockUsername(userName2);
                System.out.println("Welcome, " + object.getUsername());
                String userEnteredPass = promptUserPass();
                if (userEnteredPass.equals(userPass2)) {
                    object.lockPassword(userPass2);
                    MessageDigest md = MessageDigest.getInstance("MD5");
                    md.update(object.getPassword().getBytes());
                    byte[] digest = md.digest();
                    StringBuffer sb = new StringBuffer();
                    for (byte b : digest) {
                        sb.append(String.format("%02x", b & 0xff));
                    }
                    if (sb.toString().equals(userHashPass2)) {
                        System.out.println("Access Granted");
                        adminMSG();
                        logout();
                    }
                    break;
                }
            }
            else if (userEnteredName.equals(userName3)) {
                object.lockUsername(userName3);
                System.out.println("Welcome, " + object.getUsername());
                String userEnteredPass = promptUserPass();
                if (userEnteredPass.equals(userPass3)) {
                    object.lockPassword(userPass3);
                    MessageDigest md = MessageDigest.getInstance("MD5");
                    md.update(object.getPassword().getBytes());
                    byte[] digest = md.digest();
                    StringBuffer sb = new StringBuffer();
                    for (byte b : digest) {
                        sb.append(String.format("%02x", b & 0xff));
                    }
                    if (sb.toString().equals(userHashPass3)) {
                        System.out.println("Access Granted");
                        veterinarianMSG();
                        logout();
                    }
                    break;
                }
            }
            else if (userEnteredName.equals(userName4)) {
                object.lockUsername(userName4);
                System.out.println("Welcome, " + object.getUsername());
                String userEnteredPass = promptUserPass();
                if (userEnteredPass.equals(userPass4)) {
                    object.lockPassword(userPass4);
                    MessageDigest md = MessageDigest.getInstance("MD5");
                    md.update(object.getPassword().getBytes());
                    byte[] digest = md.digest();
                    StringBuffer sb = new StringBuffer();
                    for (byte b : digest) {
                        sb.append(String.format("%02x", b & 0xff));
                    }
                    if (sb.toString().equals(userHashPass4)) {
                        System.out.println("Access Granted");
                        zooKeeperMSG();
                        logout();
                    }
                    break;
                }
            }
            else if (userEnteredName.equals(userName5)) {
                object.lockUsername(userName5);
                System.out.println("Welcome, " + object.getUsername());
                String userEnteredPass = promptUserPass();
                if (userEnteredPass.equals(userPass5)) {
                    object.lockPassword(userPass5);
                    MessageDigest md = MessageDigest.getInstance("MD5");
                    md.update(object.getPassword().getBytes());
                    byte[] digest = md.digest();
                    StringBuffer sb = new StringBuffer();
                    for (byte b : digest) {
                        sb.append(String.format("%02x", b & 0xff));
                    }
                    if (sb.toString().equals(userHashPass5)) {
                        System.out.println("Access Granted");
                        veterinarianMSG();
                        logout();
                    }
                    break;
                }
            }
            else if (userEnteredName.equals(userName6)) {
                object.lockUsername(userName6);
                System.out.println("Welcome, " + object.getUsername());
                String userEnteredPass = promptUserPass();
                if (userEnteredPass.equals(userPass6)) {
                    object.lockPassword(userPass6);
                    MessageDigest md = MessageDigest.getInstance("MD5");
                    md.update(object.getPassword().getBytes());
                    byte[] digest = md.digest();
                    StringBuffer sb = new StringBuffer();
                    for (byte b : digest) {
                        sb.append(String.format("%02x", b & 0xff));
                    }
                    if (sb.toString().equals(userHashPass6)) {
                        System.out.println("Access Granted");
                        adminMSG();
                        logout();
                    }
                    break;
                }
            }
            else if (i == 4) {
                System.out.println("Too many failed attempts. The program will shut down.");
            }
            i++;
        }
    }
}


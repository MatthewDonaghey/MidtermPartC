/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;
import java.util.Scanner;

/**
 *
 * @author Matth
 */
public class TestUserprofile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter your name: ");
        String name = scan.nextLine();
        
        String[] genres = {"Comedy", "Drama", "Action", "Mystery"};
        System.out.println("Here are the options for genres: ");
        for(int i = 0; i<genres.length; i++){
            System.out.println(genres[i]);
        }
        
        System.out.println("Please enter the name of your favourite: ");
        String favgenre = scan.nextLine();
        
        UserProfile userProfile = new UserProfile(name, favgenre);
        System.out.println("Your profile was created");
    }
    
}

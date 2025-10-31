
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        
        while(t-- > 0){
            String line = sc.nextLine();
            boolean found = false;
            for(int i = 0; i < line.length(); i++){
                if(line.charAt(i) != 'Y' && line.charAt(i) != 'e' && line.charAt(i) != 's'){
                    found = true;
                }
            }
            
            for(int i = 0; i < line.length() - 1; i++){
                if(!(line.charAt(i) == 'Y' && line.charAt(i + 1) == 'e') && !(line.charAt(i) == 'e' && line.charAt(i + 1) == 's') && !(line.charAt(i) == 's' && line.charAt(i + 1) == 'Y')){
                    found = true;
                }
            }
            
            if(found){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }
}

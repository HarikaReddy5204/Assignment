package intro;
import java.util.Scanner;
public class q7 {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String str = sc.nextLine();
	        str = str.toLowerCase();
	        String reversed = "";
	        for (int i = str.length() - 1; i >= 0; i--) 
	        {
	            reversed += str.charAt(i);
	        }
	        System.out.println(reversed);

}
}
	  

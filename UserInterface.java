import java.util.*;
public class UserInterface
{
	public String getDuplicateElement()
    {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the size of an array");
			int size = sc.nextInt();
			
			if(size<0) {
				throw new NegativeArraySizeException();
			}
			
			int[] arr = new int[size];
			System.out.println("Enter the array elements");
			for(int i=0; i<size; i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println("Enter the position of the element to be replicated");
			int repl = sc.nextInt();
			
			int ele=arr[repl];
			StringBuilder s= new StringBuilder("The array elements are ");
			for(int i=0;i<arr.length;i++) {
				s=s.append(arr[i]);
				s=s.append(" ");
			}
			String str=s.toString() +ele;
			
			
			return(str);
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			return("Array index is out of range");
		}
		catch(InputMismatchException e) {
			return("Input was not in the correct format");
		}
		catch(NegativeArraySizeException e){
			return ("Array size should be positive");
		}
		
        // Fill the code
        //return null;
    }
	
	public static void main(String[] args)
    {
		UserInterface ui = new UserInterface();
		System.out.println(ui.getDuplicateElement());
        // Fill the code
    }
}











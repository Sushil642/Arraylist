package labs;
import java.util.*;
import java.io.*;
public class arraylist  {

	public static void main(String[] args) throws IOException{
		 
		 ArrayList<String> obj= new ArrayList<String>();
		 Scanner sc=new Scanner(System.in);
		 int c,ch=0;
		 int i,j;
		 String str,str1;
		 do {
			 System.out.println("\n1.Append\n2.Insert\n3.Search\n4.List String Start with character\n5.Size\n6.Remove\n7.Sort\n8.Display\n");
			 System.out.println("Enter the choice : ");
			 c=sc.nextInt();
			 switch(c)
			 {
			 case 1: System.out.println("Enter the String :");
			         str=sc.next();
			         obj.add(str);
			         break;
			         
			 case 2: System.out.println("Enter the string : ");
			         str=sc.next();
			         System.out.println("Enter the index ( start with 1  and end with "+(obj.size()));
                     i=sc.nextInt();
			         obj.add(i-1,str);
			         System.out.println("The Array List has following Elements : ");
			          System.out.println(obj);
			         break;
			 case 3: System.out.println("Enter the string u want to search : ");
			          str1=sc.next();
			          j=obj.indexOf(str1);
			          if(j==-1)
			        	  System.out.println("Element not present ");
			          else
			        	  System.out.println("Element present ");
			          break;
			 case 4: System.out.println("Enter the character for which u want list : ");
			         str1=sc.next();
			         for( i=0;i<obj.size();i++)
			         {
			        	 str=obj.get(i);
			        	 if(str.startsWith(str1))
			        	 {
			        		 System.out.println(str+" Start with "+ str1);
			        	 }
			        	 
			         }
			         break;
			 case 5: System.out.println("The Size of Array List is "+obj.size());
			         break;
			 case 6:System.out.println("Enter the element you want to remove : ");
			        str1=sc.next();
			        if(obj.remove(str1))
			        	System.out.println("Element Removed : "+str1);
			        else
			        	System.out.println("Element not present ");
			       break;
			 case 7:Collections.sort(obj);
			         System.out.println("The Array List has following Elements : ");
			         System.out.println(obj);
			         break;
			 case 8: System.out.println("The Array List has following Elements : ");
			          System.out.println(obj);
			          break; 
			         
			 case 9:ch=1;
			        break;
			 default: System.out.println("Plz Enter some valid choice !\n");
			          break;
			 }
		 }while(ch!=1);

	}

}

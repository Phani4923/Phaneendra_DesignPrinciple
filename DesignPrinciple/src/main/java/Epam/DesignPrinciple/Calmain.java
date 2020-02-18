package Epam.DesignPrinciple;

import java.util.*;

public class Calmain {
	public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter First number : ");
      int x=sc.nextInt();
      System.out.println("Enter Second number : ");
      int y=sc.nextInt();
      System.out.println("Select Option: ");
      System.out.println("1.Add");
      System.out.println("2.Subtract");
      System.out.println("3.Multiply");
      System.out.println("4.Divide");
      int k=sc.nextInt();
      if(k==1)
      {
        Add object=new Add(x,y);
        System.out.println("The sum of two numbers is "+object.getAdd());
      }
      else if(k==2)
      {
        Subtract object=new Subtract(x,y);
        System.out.println("The diffrence of two numbers is "+object.getSub());
      }
      else if(k==3)
      {
        Multiply object=new Multiply(x,y);
        System.out.println("The product of two numbers is "+object.getMul());
      }
      else if(k==4)
      {
        Divide object=new Divide(x,y);
        System.out.println("The division of two numbers is "+object.getDiv());
      }
      else
      {
        System.out.println("Invalid");
      }
      sc.close();
    }

}

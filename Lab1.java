import java.util.*;
class abc
{   
    void Total(double sub_1,double sub_2,double sub_3,double sub_4,double sub_5) 
    {       
        double total = sub_1 + sub_2 + sub_3 + sub_4 + sub_5;
        System.out.println("The Total marks   = " + total + "/500.0");
    }
    void Average(double sub_1,double sub_2,double sub_3,double sub_4,double sub_5)
    {
        double average = ((sub_1 + sub_2 + sub_3 + sub_4 + sub_5)/ 5.0);
        System.out.println("The Average marks = " + average);
    }
    void Percentage(double sub_1,double sub_2,double sub_3,double sub_4,double sub_5)
    {
        double percentage = (( sub_1 + sub_2 + sub_3 + sub_4 + sub_5) / 500.0) * 100;
        System.out.println("The Percentage    = " + percentage + "%");
    }

}


public class Lab1 
{

    public static void main(String args[])
     {
        System.out.println("Enter the marks of five subjects:");
        Scanner sc = new Scanner(System.in);
        double sub_1 = sc.nextDouble();
        double sub_2 = sc.nextDouble();
        double sub_3 = sc.nextDouble();
        double sub_4 = sc.nextDouble();
        double sub_5 = sc.nextDouble();
        System.out.println("Sub_1:"+sub_1);
        System.out.println("Sub_2:"+sub_2);
        System.out.println("Sub_3:"+sub_3);
        System.out.println("Sub_4:"+sub_4);
        System.out.println("Sub_5:"+sub_5);
        abc l1= new abc();
        l1.Total(sub_1,sub_2,sub_3,sub_4,sub_5);
        l1.Average(sub_1,sub_2,sub_3,sub_4,sub_5);
        l1.Percentage(sub_1,sub_2,sub_3,sub_4,sub_5);         
    }
 

}


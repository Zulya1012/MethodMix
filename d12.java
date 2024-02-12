import java.util.Scanner;
public class d12{
  public static void main (String[] arg){
    Scanner sc=new Scanner(System.in);

    for (int x=1; x>0; x++){
     listMenu();
      int a=sc.nextInt();
      
      if (a==1){
        weatherIndicators ();
        }
      
      if (a==2){ 
          calculation(sc);
      }
      if (a==3){
        weekDay();
      }
      if (a==4){
        break;
      }
      
    }    
      
    
  }

  public static void listMenu (){
    
      System.out.println("List");
      System.out.println("1.Weather indicators");
      System.out.println("2.Calculator");
      System.out.println("3.Day of the week");
      System.out.println("4. Come out");
  }
  public static void weatherIndicators (){
    int [] array={12, 15, 10, 6, 9, 20, 10};
        for(int i:array){
          System.out.println(i);
        }
  }
  public static void calculation (Scanner sc){
          int b=sc.nextInt();
          int c=sc.nextInt();
          System.out.println("Choose one is operations:");
          System.out.println("1. *");
          System.out.println("2. +");
          System.out.println("3. -");
          System.out.println("4. /");
          int d=sc.nextInt();
          
          if (d==1){
           int k=b*c;
            System.out.println(k);
          }
          if (d==2){
              int l=b+c;
              System.out.println(l);
          }
          if (d==3){
            int m=b-c;
            System.out.println(m);
          }
          if (d==4){
            int p=b/c;
            System.out.println(p);
          }
  }
  public static void weekDay(){
    System.out.println("Monday");
  }
      
}

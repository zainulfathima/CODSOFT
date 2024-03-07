import java.util.*;
class StudentGradeCalculator{
    static int sum=0;
    static int marks=0;
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.print("enter number of subjects:");
        int subjectnum = sc.nextInt();
        for(int i=1;i<=subjectnum;i++){
            System.out.print("enter marks of suject " +i);
            System.out.println(":");
            marks=sc.nextInt();
            sum += marks;
        }
            System.out.println("total marks is="+sum);
            float average;
            average = sum/subjectnum;
            System.out.println("average is="+average);
            if(average>90.0){
                System.out.println("grade achieved is A");
            }else if(average>=80.0 && average <=90.0){
               System.out.println("grade achieved is B");
            }else if(average>=70.0 && average <=80.0){
               System.out.println("grade achieved is C");
            }else if(average>=60.0 && average <=70.0){
                System.out.println("grade achieved is D");
            }else if(average>=50.0 && average <=60.0){
                System.out.println("grade achieved is E");
            }else{
                System.out.println("grade achieved is F");
            }
        } 
    }



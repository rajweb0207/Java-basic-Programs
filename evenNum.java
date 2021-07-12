//write a pro to print all even number for 0 to 20

public class Main{
	public static void main(String[] agr){
		int n=20, i=0, sum=0;
        System.out.println("Evnen num from 0 to 20 is \n");
		for(i=0; i<=20; i++){
            if(i%2 == 0){
                sum += i;
                System.out.println(i +"\n");
            }
		}
		
	}
}
import java.io.File;
import java.util.Scanner;
public class Submarine{
	public static void main(String[] args){
		try{
		Scanner sc = new Scanner(new File("./input.txt"));
		
		int lastMessaure = sc.nextInt();
		int currentMessaure = 0;
		int inc = 0;
		while(sc.hasNext()){
			currentMessaure = sc.nextInt();
			if(currentMessaure > lastMessaure){
				inc++;
			}
			lastMessaure = currentMessaure;
		}
		System.out.println(inc);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}

import java.io.File;
import java.util.Scanner;
public class Pilot{
	public static void main(String[] args){
		try{
		Scanner sc = new Scanner(new File("./input.txt"));
		int horizontal= 0;
		int depth = 0;
		String inst="";
		int n = 0;
		while(sc.hasNext()){
			inst = sc.next();
			switch(inst){
				case "forward": horizontal = horizontal + sc.nextInt();break;
				case "up": depth = depth - sc.nextInt();break;
				case "down": depth = depth + sc.nextInt();break;
			}
		}
		System.out.println(horizontal*depth);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}

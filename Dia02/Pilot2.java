import java.io.File;
import java.util.Scanner;
public class Pilot2{
	public static void main(String[] args){
		try{
		Scanner sc = new Scanner(new File("./input.txt"));
		int horizontal= 0;
		int depth = 0;
		String inst="";
		int aim = 0;
		int n = 0;
		while(sc.hasNext()){
			inst = sc.next();
			n = sc.nextInt();
			switch(inst){
				case "forward": 
					horizontal = horizontal + n;
					if(aim > 0)
					 depth =depth +  n * aim;
					break;
				case "up": aim = aim -  n;break;
				case "down": aim = aim + n;break;
			}
		}
		System.out.println(horizontal*depth);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}

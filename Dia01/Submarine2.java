import java.io.File;
import java.util.Scanner;
public class Submarine2{
	public static void main(String[] args){
		try{
		Scanner sc = new Scanner(new File("./input.txt"));
		int [] container= new int[2];
		int lastMessaure = sc.nextInt();
		container[0] = sc.nextInt();
		container[1] = sc.nextInt();
		lastMessaure = lastMessaure + container[1] + container [0];
		int currentMessaure = 0;
		int inc = 0;
		int aux = 0;
		while(sc.hasNext()){
			currentMessaure =  sc.nextInt();
			aux = container[1] + container[0];
			aux =  aux + currentMessaure;
			container[0] = container[1];
			container[1] = currentMessaure;
			if(aux > lastMessaure){
				inc++;
			}
			lastMessaure = aux;
		}
		System.out.println(inc);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}

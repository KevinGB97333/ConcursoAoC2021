import java.io.File;
import java.util.Scanner;
import java.lang.Math;
public class Report{
	public static void main(String[] args){

		try{
		Scanner sc = new Scanner(new File("./input.txt"));
		int [] e = new int[12];
		int [] g = new int[12];
		int [] [] b = new int [1000] [12];
		String c="";
		int k=0;
		int c0 = 0;
		int c1 = 0;
		while(sc.hasNext()){
			c=sc.nextLine();
			for(int i = 0;i<e.length;i++){
				b[k][i] = Character.getNumericValue(c.charAt(i));
			}
			k++;
		}
	for(int i = 0;i<e.length;i++){
		c0 =0;c1=0;
		for (int j = 0;j<1000;j++){
			if(b[j][i] == 0){
				c0++;
			}else{
				c1++;
			}
		}
		if(c0>c1){
			g[i] = 0;
			e[i] = 1;
		}else{
			g[i] = 1;
			e[i] = 0;
		}
	}
	double eR =0;
	double gR =0;
	int n = 11;
	for(int i =0; i<e.length;i++){
		d=d+e[i];
		d1=d+g[i];
		if(e[i] == 1){
			eR = eR + Math.pow(2,n);
		}
		if(g[i] ==1){
			gR = gR + Math.pow(2,n);
		}
		n--;
	}
		System.out.println(eR*gR);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}

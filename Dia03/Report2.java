import java.io.File;
import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;
static void buscar(int [][] b,ArrayList<Integer>, ArrayList<Integer> arr, ArrayList<Integer> arr2,int s,int p){
	for(int j = 0; j<1000;j++){
		if(b[j][p] == s){
			arr.add(j);
		}else{
			if(arr2 != null)
			arr2.add(j);
		}
	}
}
public class Report{
	public static void main(String[] args){

		try{
		Scanner sc = new Scanner(new File("./input.txt"));
		int [] e = new int[12];//o
		int [] g = new int[12];//co2
		int [] [] b = new int [1000] [12];
		ArrayList<Integer>  arr = new ArrayList<Integer>();
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		int s = 0;//o
		int s1 = 0;//co2
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
		for (int j = 0;j<1000;j++){
			if(b[j][0] == 0){
				c0++;
			}else{
				c1++;
			}
		}
		if(c0>c1){
			s = 0
			s1 = 1;
		}else{
			s = 1;
			s1 = 0;
		}
		buscar(b,arr,arr2,s,0);
		int o [][] = new int [arr.size()][12];
		int o2[][] = new int [arr2.size()][12];

		for int j = 0; j<arr.size();j++){
			for(int i = 0;i<12;i++){
				o[j][i] = b[arr.get(j)][i];
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

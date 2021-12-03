import java.io.File;
import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;

public class Report2{
	static void buscar(int [][] b, ArrayList<Integer> arr,int s,int p){//añado a la lista las filas que cumplen la condicion
		for(int j = 0; j<b.length;j++){
			if(b[j][p] == s){
				arr.add(j);
			}
		}
	}
	static int[][] traspasar(ArrayList arr, int b[][]){
		int [][]o = new int [arr.size()][12];
		for (int j = 0; j<arr.size();j++){
			for(int i = 0;i<12;i++){
				o[j][i] = b[(int)arr.get(j)][i];
			}
		}
		return o;
	}
	static int ocurrencias(int [][]o, int pos){//busco cual es el numero que más se repite en la posicion pos
		int c0= 0;
		int c1 = 0;
		for (int j = 0;j<o.length;j++){
			if(o[j][pos] == 0){
				c0++;
			}else{
				c1++;
			}
		}
			if(c0>c1){
				return 0;
			}else{
				return 1;
			}
		}
	static int ocurrencias2(int [][]o, int pos){//busco el numero que menos se repite en la posicon pos
			int c0= 0;
			int c1 = 0;
			for (int j = 0;j<o.length;j++){
				if(o[j][pos] == 0){
					c0++;
				}else{
					c1++;
				}
			}
				if(c0<=c1){
					return 0;
				}else{
					return 1;
				}
			}
	static double conBin(int o [][]){
		double n = 11;
		double res = 0;
		String num ="";
		for(int i = 0;i<o[0].length;i++){
			num = num +o[0][i];
			if(o[0][i] == 1){
				res = res + Math.pow(2,n);
			}
			n--;
		}
		System.out.println(num);
		return res;
	}
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
			s = 0;
			s1 = 1;
		}else{
			s = 1;
			s1 = 0;
		}
		buscar(b,arr,s,0);
		buscar(b,arr2,s1,0);
		int o [][] = traspasar(arr,b);
		int o2[][] = traspasar(arr2,b);
		boolean fin = false;
		int pos = 1;
		while(!fin){
			s = ocurrencias(o, pos);
			arr.clear();
			buscar(o, arr, s, pos);
			o = traspasar(arr,o);
			if(arr.size() == 1){
				fin = true;
			}
			pos++;
		}
		pos = 1;
		fin = false;
		while(!fin){
			s1 = ocurrencias2(o2,pos);
			arr2.clear();
			buscar(o2, arr2,s1, pos);
			o2 = traspasar(arr2,o2);
			if(arr2.size() == 1){
				fin = true;
			}
			pos++;
		}
	double eR =0;
	double gR =0;
	gR = conBin(o);
	eR = conBin(o2);
		System.out.println(eR*gR);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}

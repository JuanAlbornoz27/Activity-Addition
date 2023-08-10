package model;

import java.util.ArrayList;

public class Adder {
	private ArrayList<Integer> arrayNumbers;
	public Adder(ArrayList<Integer> arrayNumbers) {
		this.arrayNumbers = arrayNumbers;
	}

	public String getOpperations(int number){
		int sum=0;
		String result="{";
		for (int i = 0; i < arrayNumbers.size(); i++) {
			result += "{."+arrayNumbers.get(i);
			for (int j = 1; j <arrayNumbers.size(); j++) {
				if(sum<number)
					sum+= arrayNumbers.get(i)+ arrayNumbers.get(j);
					result += ","+arrayNumbers.get(j);
			}
			if(sum== number) {
				result+="}";
			}
			else {
				sum=0;
				result="{";
			}

		}return result;}
	
}


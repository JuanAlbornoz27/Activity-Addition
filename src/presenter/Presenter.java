package presenter;

import java.util.Scanner;

import model.Adder;
import persistence.MyFile;

public class Presenter {
	private Adder adder;
	public Presenter() {
		adder= new Adder(new MyFile().fillArray());
	}
	
 public Adder getAdder() {
		return adder;
	}


public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Ingrese un numero");
	Presenter presenters= new Presenter();
	System.out.println(presenters.getAdder().getOpperations(sc.nextInt()));
}
}

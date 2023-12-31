
package persistence;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
// import java.io.BufferedWriter;
// import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
public class MyFile {
	private File f;
//	private FileWriter fw;
	private FileReader fr;
//	private BufferedWriter bw;
	private BufferedReader br ;
	
	public MyFile() {
		f = new File("ActivitieAddition/resources/numbers.txt");
		this.openFile();
	}

	public void openFile()	{
		try {
			//modo escritura "w" crea el archivo
//			if (modo=='w'){
//				fw = new FileWriter(f);
//				bw = new BufferedWriter(fw);
//			}
//			else{
				//modo lectura "r" abre el archivo
				fr = new FileReader(f);
				br = new BufferedReader(fr);
//			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

	//Almacena la cadena ingresada por parametro
//	public void addRecord(String cad){
//		if (bw!=null){
//			try {
//				bw.write(cad);
//				bw.newLine();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//	}
	// Lee una l�nea del archivo
	public String readRecord(){		  
		String cad="";	
		try {
			cad= br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cad;		   
	}
	// cierra archivo modo R/W	 
	public void closeFile(){
		try {
			if (br!=null)
				br.close();
//			if (bw!=null)
//				bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	
	public ArrayList<Integer> fillArray(){
		ArrayList<Integer> arrayNumbers = new ArrayList<>();
		String [] numbersString= readRecord().split(",");
		for (int i = 0; i < numbersString.length; i++) {
			arrayNumbers.add(Integer.parseInt(numbersString[i]));
		}
		return arrayNumbers;
	}

}
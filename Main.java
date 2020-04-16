package pckg1;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Medoc> medocs = readMedocFromCSV("final2.csv");
		
		for(Medoc m :medocs) {
			System.out.println(m);
			
		}
				
		System.out.println(medocs.size());

	}
	
	
	
	
	private static List<Medoc> readMedocFromCSV(String filename){
		List<Medoc> medocs = new ArrayList<>();
		Path pathToFile = Paths.get(filename);
		
		try(BufferedReader br = Files.newBufferedReader(pathToFile,
                StandardCharsets.UTF_8)){
			
			//read 1st line
			String line = br.readLine();
			line = br.readLine();
			//String[] attributes = line.split(",");
			//System.out.println(attributes[11]);
			
			while(line != null) {
				
				String[] attributes = line.split(",");
				//System.out.println(attributes[0]);
				//System.out.println(attributes[11]);
				Medoc medoc = createMedoc(attributes);
				
				medocs.add(medoc);
				
				line = br.readLine();
				
			}
		}catch (IOException ioe) {
            ioe.printStackTrace();
        }
		
		return medocs;
	}
	
	
	private static Medoc createMedoc(String[] metadata) {
		
		String cpd = metadata[1];
		String dosage = metadata[3];
		String forme = metadata[4];
		String name = metadata[5];
		String sub_act = metadata[6];
		String v_admin = metadata[8];
		//System.out.println(metadata[9]);
		
		int cip7 = Integer.parseInt(metadata[9]);
		int cis = Integer.parseInt(metadata[10]);
		System.out.println(metadata[11]);
		if(metadata[11].length() > 5) {
			metadata[11] = metadata[11].substring(0, metadata[11].length() - 1);
			metadata[11] = metadata[11].substring(0, metadata[11].length() - 1);
			metadata[11] = metadata[11].substring(0, metadata[11].length() - 1);
		}
		float prix = Float.parseFloat(metadata[11]);
		Medoc m = new Medoc(cis, cip7, name, sub_act, dosage, forme, v_admin, prix, cpd);
		return m;
	}
	
	
	
	
	
	

}

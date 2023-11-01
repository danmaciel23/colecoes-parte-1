package colecoes_parte_1;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Main {
		

			public static void main(String[] args) {
				List<String> names = new ArrayList<>();
				
				names.add("danilo");
				names.add("caio");
				names.add("pedro");
				names.add("jordao");
				names.add("jao");
				names.add("loco");
				names.add("tiquinho");
				
				Collections.sort(names);
				
				System.out.println("Nomes em ordem alfabética:");
				for(String name: names) {
					System.out.println(name);
				}

			}

		}
	

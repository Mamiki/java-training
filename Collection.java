import java.util.List;
import java.util.ArrayList;

import java.util.Set;
import java.util.HashSet;

public class Collection {	
 
      public static void main(String[] args){	
             List<String> listeDeNoms = new ArrayList<>(10);

                       /* listeDeNoms.add("fouiller");
                        listeDeNoms.add("seulement");
                        listeDeNoms.add("gagner");    
                        listeDeNoms.add("soigner");
                        listeDeNoms.add("cafe");
			listeDeNoms.add("cuisiner");
			listeDeNoms.add("maigrir");
			listeDeNoms.add("voler");
			listeDeNoms.add("traiter");
			listeDeNoms.add("decevoir");
                        listeDeNoms.add("perdu");

                     for (String verbe : listeDeNoms){	
	                 System.out.println(verbe);
	}*/
             Set<String> listeDeNomsAvecSet = new HashSet<>(10);
		
			listeDeNomsAvecSet.add("Bip-Bip");
			listeDeNomsAvecSet.add("super");
			listeDeNomsAvecSet.add("coiffer");
			listeDeNomsAvecSet.add("se chamailler");
			listeDeNomsAvecSet.add("gauffre");
			listeDeNomsAvecSet.add("blesser");
			listeDeNomsAvecSet.add("plaisir");
			listeDeNomsAvecSet.add("jongler");
                        listeDeNomsAvecSet.add("bobo");
			listeDeNomsAvecSet.add("bobo");

		for (String nom : listeDeNomsAvecSet){	
		System.out.println(nom);
}	




		
                





   }

}

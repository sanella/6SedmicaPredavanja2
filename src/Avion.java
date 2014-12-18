import java.util.Arrays;


public class Avion {
private Paketa[] paketiUAvionu = new Paketa[3];

public Paketa[] getPaketiUAvionu() {
	return paketiUAvionu;
}

public double getTotalWeight(){
	double total = 0;
	for(Paketa prvi : paketiUAvionu){
		total += prvi.getWeight();
		
	}
	return total;
}


 }

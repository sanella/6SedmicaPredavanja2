import java.io.ObjectInputStream.GetField;


public class PaketArray {
public static void main(String[] args) {
	
	Paketa[] paketi = new Paketa[3];
	
	for(int i = 0; i<paketi.length; i++){
		paketi[i] = getPaketa();
	}
	
	for(Paketa prvi : paketi){
		System.out.println(prvi);
	}
}
	public static Paketa getPaketa(){
		Paketa prvi = new Paketa();
		System.out.println("Unesi podatke");
		prvi.setHeight(TextIO.getDouble());
		prvi.setLenght(TextIO.getDouble());
		prvi.setWeight(TextIO.getDouble());
		prvi.setWidth(TextIO.getDouble());
		System.out.println(prvi);
		return prvi;
	}
}


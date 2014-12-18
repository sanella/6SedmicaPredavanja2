
public class PaketTest {
public static void main(String[] args) {
	Paketa prvi = new Paketa();
	System.out.println("Unesi dimenzije i tezinu paketa");
	prvi.setHeight(TextIO.getDouble());
	prvi.setLenght(TextIO.getDouble());
	prvi.setWeight(TextIO.getDouble());
	prvi.setWidth(TextIO.getDouble());
	System.out.println(prvi);
}
}

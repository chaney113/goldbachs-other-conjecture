package goldbachsOtherConjecture;

public class GOCMain {

	public static void main(String[] args) {
		GoldbachsOtherConjecture goc = new GoldbachsOtherConjecture();
		goc.helloWorld();
		
		for ( int i = 9; i < 1000; i+=2 ) {
			goc.formula(i);
		}
	}
}

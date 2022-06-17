import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        //root 6 * (1 + 1/sumInverses exp 2) = pi*/
        //where sumInverses is the sum of the inverses
        //of the squares of the positive integers
        double trys = 100000;
		double sumInverses = 0;
		double piAprox = 0;
		for(int i = 0; i < (int) trys; i++) {
			sumInverses += 1 / Math.pow(i + 1, 2);
		}
		piAprox = Math.sqrt(6*sumInverses);
		System.out.println(piAprox);
    }
    
}

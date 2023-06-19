package sample;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class Sample{
	public static void main(String []arg) throws NoSuchAlgorithmException {
		SecureRandom sr1 = SecureRandom.getInstance("SHA1PRNG");
		int N = 10000;
		for(int i = 0 ; i < N ; i++) {
			System.out.println(sr1.nextInt(N));
		}

	}
}
package curriculum.c;

import java.util.Random;
	public class CPU{
		public int getHand(){
		Random random = new Random(); 
		return random.nextInt(3);
	}
}		

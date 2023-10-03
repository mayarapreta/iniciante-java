package Ex1_OrdemInversa;

public class OrdemInversa {

	public static void main(String[] args) {
		
		
		int[] Vetor =  {-5,-6,15,58,8,4};
		 
		/*System.out.println(Vetor.length);*/
		 
		System.out.println("Vetor: ");
		
		int count = 0;
  while(count < ( Vetor.length )){
	  
	  System.out.println(Vetor[count] + "");
	  count++;
  }
  
  System.out.println("\nVetor: ");
  for(int i = ( Vetor.length - 1); i >= 0; i--) {
	  
	  System.out.println(Vetor[i] + "");
  }
	}

}

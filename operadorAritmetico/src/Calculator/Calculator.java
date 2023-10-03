package Calculator;

public class Calculator {

 public int add (int a , int b) {
	 return (a+b);
 }
 
 public int sub (int a, int b) {
	 return (a-b);
 }
 public int multiply (int a , int b) {
	  return (a*b);
 }
 public int divide (int a, int b) {
	 return (a/b);
 }




public class   calcul {
	 
	 public static void main(String[]args) {
		 
	Calculator cal = new Calculator();
  
	int result = cal.add(4,2); //chame o metodo add 
  
  System.out.println(result); //6
  
  result = cal.sub(4, 2); //chame o metodo sub
  System.out.println(result);
  
  result = cal.multiply(4,2);//chame o metodo multiply
  System.out.println(result); //8
  
  result = cal.divide(4,2);// chame o metodo divide
  System.out.println(result); //2
	 }
}

}
	 
 
 
  
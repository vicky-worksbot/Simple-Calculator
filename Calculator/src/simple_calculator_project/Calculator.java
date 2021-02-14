package simple_calculator_project;

public class Calculator extends CalculatorOperation{  

	public static void Normalcalculator(double A,double B,int c) {

		switch(c) {
		case 1: System.out.printf("Result=%.3f\n",add(A,B));
		          break;
		case 2: System.out.printf("Result=%.3f\n",sub(A,B));
        		  break; 
		case 3: System.out.printf("Result=%.3f\n",mul(A,B));
        		  break; 
		case 4: System.out.printf("Result=%.3f\n",div(A,B));
        		  break; 
		case 5: System.out.printf("Result=%.3f\n",mod((int)A,(int)B));
        		  break; 
        default:System.out.println("Wrong input");
        break;

		}

	}

}
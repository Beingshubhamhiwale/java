import java.util.Scanner; //import scanner class of util package

class SwitchExample{
		
		public void calc_grade(String grade){
			switch(grade) { //switch(expression)
			case "A" : 
			System.out.println("1st semester marks is  100 + 80 ");
			break;
			
			case "B" : 
			System.out.println("2nd semester marks is  80 + 65 ");
			break;
			
			case "C" : 
			System.out.println("3rd semester marks is  65 + 50 ");
			break;
			
			case "D" : 
			System.out.println("4th semester marks is  50 + 36 ");
			break;
			
			case "F" : 
			System.out.println("5th semester marks is  35");
			break;
			
			default:
			System.out.println("Error... Invalid grade");
			
		}
		}
		public static void main (String args[]){
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter grade ");
			String grade = sc.next();
			grade = grade.toUpperCase();
			
			SwitchExample se = new SwitchExample();
			se.calc_grade(grade);
		}
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simplecalculatorproject;
import java.util.Scanner; 
/**
 *
 * @author Vedika
 */
public class SimpleCalculatorProject {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner task1= new Scanner (System.in);
        
            //ask for the 2 number imput 
            System.out.print("Please enter 2 numbers seperated by spaces: ");
            String num = task1.nextLine();//task.next()
            //separete the input using indexOf the space
            String num1str = num.substring(0,num.indexOf(' '));
            String num2str = num.substring(num.indexOf(' ')+1);

            //convert the string to double value beacause they are numbers
            double num1 = Double.parseDouble(num1str);
            double num2 = Double.parseDouble(num2str);


             //ask for the operator
            System.out.print("please enter the operator(+,-,* or /):  ");
            String TheOperator = task1.nextLine();
            //convert operation to character value 
            char oper = TheOperator.charAt(0);

            //ask for the formula  
            System.out.print("please enter the formula,(eg. 3.14 * 2):  ");       
            String formula = task1.nextLine();
            
            System.out.println("     ");
            
            String colonStr = ":";
            
            //calling the methods and printing them 
            double addition = calcResult ( num1,num2);
            System.out.printf("Calling the first method %2s %.2f + %.2f = %.2f \n",
                    colonStr,num1, num2, addition);

            double operation = calcResult (num1,num2,oper ); 
            System.out.printf("Calling the second method %s %.2f %c %.2f = %.2f \n" ,
                    colonStr,num1, oper, num2,operation);

            double Theformula = calcResult  (formula); 
            System.out.printf("Calling the third method %2s %s = %.2f \n ",
                    colonStr,formula,Theformula);
    }

        //method 1     
        public static double calcResult(double num1, double num2){
            return num1+num2;
        } 
        
        //method 2 (the calculations) 
        public static double calcResult(double num1, double num2, char oper){

            double answer = 0; 

            switch (oper){

            case '*' : 
                answer = num1 * num2;
                break; 

            case '/':
                answer = num1 / num2; 
                break; 
            
            case '-':
                answer = num1 - num2; 
                break; 
            
            case '+':
                answer= num1 + num2; 
                 break; 
            }
            return answer;      
                }

        public static double calcResult (String formula) {

            //find the positiosn of the spaces using indexOf
            int firstSpace = formula.indexOf(' ');
            int SecondSpace = formula.indexOf(' ',firstSpace +1);
            
            //extract the components 
            String number1 = formula.substring(0,firstSpace);
            String operatorFormula = formula.substring(firstSpace+1,firstSpace + 2);
            String number2 = formula.substring (SecondSpace +1 );

            //converts the strings to double(for numbers) and char for oper
            double num1 = Double.parseDouble(number1);
            double num2 = Double.parseDouble(number2);
            char oper = operatorFormula.charAt(0);

            //call the second method
            double answer = calcResult( num1, num2, oper);
            return answer; 
          } 

    }






        
    
         


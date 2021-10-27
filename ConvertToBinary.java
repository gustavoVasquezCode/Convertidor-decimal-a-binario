import java.io.*;
import java.lang.NumberFormatException;

public class ConvertToBinary{
public static void main(String[ ] args) throws IOException{

boolean bandera = true;

DecimalToBinary obj1 = new DecimalToBinary( );

InputStreamReader stream = new InputStreamReader(System.in);
BufferedReader reader = new BufferedReader(stream);

System.out.println("---------- Converter decimal to binary ----------");
while(bandera){
System.out.print("Enter a whole number: ");
try{
obj1.setDecimal(Integer.valueOf(reader.readLine( )).intValue( ));
if(obj1.getDecimal( ) >= 0)
   bandera = false;
else
   System.out.println("\nEnter a positive number\n");
}
catch(NumberFormatException e){
System.out.println("\nError, enter whole a number\n");
}
}
obj1.converterToBinary( );
System.out.println("\nConverter the " + obj1.getDecimal( ) + " to binary is: " + obj1.getBinary( ));

}
}
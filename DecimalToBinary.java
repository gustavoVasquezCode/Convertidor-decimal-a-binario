public class DecimalToBinary{

private int decimal;
private String binary;

public void converterToBinary( ){
String convert="";
int waste = 0;
int division;

do{
waste = decimal % 2;
decimal = decimal / 2;
division = decimal;
convert = convert + String.valueOf(waste);
}while(division != 0);

StringBuilder rev = new StringBuilder(convert);
binary = rev.reverse( ).toString( );
}

public void setDecimal(int decimal){
this.decimal = decimal;
}

public void setBinary(String binary){
this.binary = binary;
}

public int getDecimal( ){ return decimal; }

public String getBinary( ){ return binary; }

}
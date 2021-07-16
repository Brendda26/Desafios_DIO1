
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class minhaClasse {
	
  public static void main(String[] args) throws IOException {
    String linhaNum;

    BufferedReader l = new BufferedReader(new InputStreamReader(System.in));

  int  posit = 0;
  int  negat = 0;
  int  par = 0;
  int  impar = 0;
  int  numero ;

  for (int i = 0; i < 5; i++) {
    linhaNum =l.readLine();
    numero = Integer.parseInt(linhaNum);

    if (numero % 2 ==0){
      par ++;
    }else{
      impar ++;
    }

    if (numero > 0){
      posit ++;
    }
    if (numero<0){
      negat ++;
    }

  }
//insira suas variaveis corretamente
  System.out.println( "" + par + " valor(es) par(es)");
  System.out.println( "" + impar + " valor(es) impar(es)");
  System.out.println( "" + posit + " valor(es) positivo(s)");
  System.out.println( "" + negat + " valor(es) negativo(s)");
  
    
  }

	
}




/*Você deve fazer a leitura de 5 valores inteiros. Em seguida mostre quantos valores informados são pares, 
quantos valores informados são ímpares, quantos valores informados são positivos e quantos valores 
informados são negativos.
Entrada

Você receberá 5 valores inteiros.
Saída

Exiba a mensagem conforme o exemplo de saída abaixo, sendo uma mensagem por linha e não esquecendo
 o final de linha após cada uma.
 
Exemplo de Entrada 	      

-5                     
0
-3
-4
12
	

Exemplo de Saída

3 valor(es) par(es)
2 valor(es) impar(es)
1 valor(es) positivo(s)
3 valor(es) negativo(s)
*/
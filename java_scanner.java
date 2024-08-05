package mainJava.java_scanner;



import java.util.Scanner;
import javax.swing.JOptionPane;

public class java_scanner {

    public static void main(String[] args) {
        
Scanner sc = new Scanner(System.in);
/*Scanner sc = new Scanner(System.in);
   System.out.println("¿Cuál es tu nombre?");

String nombre = sc.nextLine();

System.out.println("¿Cuál es tu edad?");
int edad = sc.nextInt(); //Integer.parseInt( sc.nextLine() );
sc.nextLine();

System.out.println("¿Es de tu agrado el curso?");
boolean valor = sc.nextLine().equals("si"); //Integer.parseInt( sc.nextLine() );



   System.out.println("Hola " + nombre + " " + edad + " " + valor);
*/

String nombre = JOptionPane.showInputDialog(null, "¿Cuál es tu nombre?");
String materia = JOptionPane.showInputDialog(null, "¿Cuál es la materia que impartes?");
String sexo = JOptionPane.showInputDialog(null, "¿Cuál es tu género?");

String genero = "instructora";
System.out.println(materia);
System.out.println(nombre);
System.out.println(sexo);
if(sexo == "mujer" || sexo == "femenino"){
 genero = "instructora";

}

String mensaje = ("Hola " + nombre + " " + genero + " de " + materia + ". Mi nombre es Denis, me gusta escuchar música y tomar mucha agua.");

JOptionPane.showMessageDialog(null, mensaje);

sc.close();
}
}

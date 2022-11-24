
package holamundo.jv_class2;
//libreria para entrada y salida de datos
import java.util.Scanner;
//libreria para salida de datos en una ventana emergente
import javax.swing.JOptionPane;

public class JV_Class2 {

    public static void main(String[] args) {
        //guardar datos
            //se declara una variable para utilizar la funcion scanner
        Scanner entrada = new Scanner(System.in);
        
        //Ejemplo
        int numero; //otro Ej : string palabra
        
        System.out.println("Escriba un numero: ");
        
        numero = entrada.nextInt(); //otro Ej : palabra = entrada.nextLine(); (Se utiliza .next() para guardar solo una palabra)
        
        System.out.println("el numero es : "+numero);
        
        //Ejemplo2
        
        char letra;
        System.out.println("inserte un caracter: ");
        letra = entrada.next().charAt(0); // .charAt se utiliza para guardar el primer caracter que se escriba
        System.out.println("El caracter es: "+letra);
        
        //casting
        
            //Implicito
            
        int a = 80;
        long b = a; //Se puede
        //int c = b no se puede
        
            //Explicito
          
        int n;
        double p = 4.221;
        n = (int)p; //retornara el valor entero sin lo decimal
        
        
        //ejemplo de comparaciones
        
        String cadena1 = "gola";
        String cadena2 = "hola";
        
        if(cadena1.equals(cadena2)){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
        //.Equals se utiliza para comparar Cadenas || == se utiliza para comparar objetos
        
        
        //salida de datos con JoptionPane
        
        String cadena3;
        int numero3;
        char letra3;
        
        cadena3 = JOptionPane.showInputDialog("inserte una frase: ");
        //para guardar un entero
        numero3 = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero: "));
        //para guardar un caracter
        letra3 = JOptionPane.showInputDialog("ingrese un caracter").charAt(0);
        
        //mostrar todos estos datos
        JOptionPane.showMessageDialog(null,"el numero escrito fue: "+numero3);
        JOptionPane.showMessageDialog(null,"la letra escrita fue: "+letra3);
        JOptionPane.showMessageDialog(null,"la frase escrita fue: "+cadena3);
        
        
        
    }
}

import com.company.Etakemon;
import com.sun.org.apache.xpath.internal.SourceTree;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Main {
    // borrar con el remove sin indice, borrar un objetop como parametro
    //crear un objeto qwe tenmga la id que quiero
    // crero un pokmeon borrar , le pongo la id que me diga le user, ye ste objeto le paso al remove
    //asi lo borra sin qe yo lo aya de buscar

    public static void main(String[] args) {
        // write your code here
        /*Etakemon pokemon1 = new Etakemon();
        Etakemon pokemon2 = new Etakemon("Pedro");*/
        Scanner sc = new Scanner(System.in);
        Etakemon pokemon1 = new Etakemon("Juan", 10);
        Etakemon pokemon2 = new Etakemon("Juan2", 11);
        Etakemon pokemon3 = new Etakemon("Juan3", 12);
        Etakemon pokemon4 = new Etakemon("Juan4", 13);
        Etakemon pokemon5 = new Etakemon("Juan5", 14);
        Etakemon pokemon6 = new Etakemon("Juan6", 15);


        List<Etakemon> Pokedex = new ArrayList<Etakemon>(10);
        Pokedex.add(pokemon1);
        Pokedex.add(pokemon2);
        Pokedex.add(pokemon3);
        Pokedex.add(pokemon4);
        Pokedex.add(pokemon6);
        //Pokedex.re
        Pokedex.add(pokemon5);

        for (Etakemon e : Pokedex) {
            System.out.println("nombre: " + e.getNombre() + "nivel:" + e.getLvl() + " el id es: " + e.getId());
        }
        // dame el id que quieres borrar será i
        //int aByte = System.in.read();
        int n;
        System.out.print("Introduzca un número entero: ");
        n = sc.nextInt();


        int BorrarEste;

        for (int i = 0; i < Pokedex.size(); i++) {
            if (Pokedex.get(i).getId() == n) {

                Pokedex.remove(i);
            }

        }
        for (Etakemon e : Pokedex) {
            System.out.println("nombre: " + e.getNombre() + "nivel:" + e.getLvl() + " el id es: " + e.getId());

        }

        String buscar= "Juan5";
        System.out.println(" dentro hay " + buscar);
        // si pongo las 2 lineas de abajo el buscar se sustituye por algo vacio, cocncuerda con el if y sale de la aplicacion xq lo qe no me sirve T_T puta vida ekisde
        System.out.println("Introduzca texto: ");
        String buscar1 = sc.next();
        System.out.println(" dentro hay 2 " + buscar1);



        for (int ii = 0; ii < Pokedex.size(); ii++) {

            if (Pokedex.get(ii).getNombre().equals(buscar1)) {
                System.out.println("el nombre es:" + Pokedex.get(ii).getNombre() + " nivel: " + Pokedex.get(ii).getLvl() + "su ID es: " + Pokedex.get(ii).getId());


            }

        }
        System.out.println(" dentro hay3 " + buscar);
    }
}







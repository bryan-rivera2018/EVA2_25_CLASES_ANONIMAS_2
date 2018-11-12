/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bryan Rivera Villaseñor 18550367
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Operaciones objOperacion = new Operaciones(){
           @Override
           public int suma(int val1, int val2) {
             return val1 + val2;
           }

           @Override
           public String suma(String cade1, String cade2) {
               return cade1 + cade2;
           }

           @Override
           public boolean suma(boolean bool1, boolean bool2) {
               return bool1 && bool2;
           }
       };
       
        System.out.println(objOperacion.suma("mundo", "cruel"));
        System.out.println(objOperacion.suma(5, 18));
        System.out.println(objOperacion.suma(true, false));
    }
    
}
interface Operaciones{
    public int suma(int val1, int val2);
    public String suma(String cade1, String cade2);
    public boolean suma(boolean bool1, boolean bool2);
}
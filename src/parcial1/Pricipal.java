package parcial1;
public class Pricipal {
    public static void main(String[] args) {
        
         Libro libro1 = new Libro("Don quijote de la mancha", "Miguel de cervante", 7, 4);
        libro1.imprimpir();
         
       System.out.println(libro1);
       System.out.println("Préstamo libro1: " + libro1.disponible());
       System.out.println();
       System.out.println("Devolución libro1: " + libro1.devolucion());
       System.out.println();
       
        Libro libro2 = new Libro("La divina comedia", "Dante Alighieri", 8, 3);
        libro2.imprimpir();
         
       System.out.println(libro2);
       System.out.println("Préstamo libro2: " + libro2.disponible());
       System.out.println();
       System.out.println("Devolución libro2: " + libro2.devolucion());
       System.out.println();













    }
    
}

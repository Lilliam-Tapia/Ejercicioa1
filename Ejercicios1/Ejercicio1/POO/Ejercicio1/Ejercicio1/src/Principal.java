public class Principal extends Libro {

    public static void main(String[] args) {
        Libro L1 =  new Libro("LA BIBLIOTECA DE MEDIA NOCHE","9788411484930","Matt Haig",336);
        Libro L2 = new Libro("La insoportable levedad del ser","9789510477243","Milan Kundera",335);
        System.out.println(L1.toString());
        System.out.println(L2.toString());
        System.out.println(L1.Mayor (0) );
        

    }



}
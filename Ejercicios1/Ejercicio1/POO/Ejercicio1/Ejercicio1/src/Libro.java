public class Libro {
    private String Titulo;
    private String ISBN;
    private String Autor;
     private int numeroPaginas;

    public Libro(String Titulo, String ISBN, String Autor, int numeroPaginas) {
        this.Titulo = Titulo;
        this.ISBN = ISBN;
        this.Autor = Autor;
        this.numeroPaginas = numeroPaginas;
    }

    Libro() {
       
    }

 

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
    public String toString (){
         return"El libro: "  + Titulo +  " con ISBN: "  + ISBN + " creado por el Autor: " + Autor + " tiene: " + numeroPaginas  + " paginas.";
    }
   public String  Mayor(int numeroPaginas  ){
        int L1= 336;
        int L2= 335 ;
    if ( L1>L2){
        return("El libro 1 tiene mas paginas: " + L1);
      }else{
        return("El libro 2 tiene mas paginas: " + L2);
    }
        
}
    
}
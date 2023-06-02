public class main {
    public static void main(String[] args) {

        // creamos la instancia para los libros con el constructor de la clase literatura
        literatura libro1 = new literatura("Juan Falconi",2002,"Aventuras del Bosque",189,"Primera");
        literatura libro2 = new literatura("Liam Loor",2015,"Amigos Inseparables",200,"Tercera");
        literatura libro3 = new literatura("Kerwin Peñafiel",2020,"¿Como ganar amigos?",320,"Segunda");
        literatura libro4 = new literatura("Joselin Jaramillo",2004,"Aventuras de Amor con Joss",250,"Cuarta");
        literatura libro5 = new literatura("Neithan Boorges",2023,"La musica salva vidas",130,"Primera");

        //Libro 1
        libro1.imprimirLibros();
        libro2.imprimirLibros();
        libro3.imprimirLibros();
        libro4.imprimirLibros();
        libro5.imprimirLibros();

    }
}

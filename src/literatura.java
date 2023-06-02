public class literatura {
    //Atributos
    String autor; // variable en donde se almacenara el autor del libro tipo cadena
    int anio; // varible en donde se almacenara el año del libro entero
    String titulo; // variable donde se alamacenara el titulo del libro de tipo cadena
    int nPage; // variable donde se alamacenara el numero de paginas del libro de tipo entero
    String edicion; //variable donde se almacenara la edicion del libro de dato tipo cadena

    public literatura(String autor, int anio, String titulo, int nPage, String edicion) { // usando el constructor para inicializar los atributos
        this.autor = autor;
        this.anio = anio;
        this.titulo = titulo;
        this.nPage = nPage;
        this.edicion = edicion;
    }

    //creacion de los metodos setters and getters para usarlos mas adelanta en el main
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getnPage() {
        return nPage;
    }

    public void setnPage(int nPage) {
        this.nPage = nPage;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    //creamor un metodo para mostrar la informacion del libro
    public void imprimirLibros(){
        System.out.print("\nNombre del autor: ");
        System.out.println(this.getAutor());
        System.out.print("El año del lanzamiento: ");
        System.out.println(this.getAnio());
        System.out.print("Titulo del Libro: ");
        System.out.println(this.getTitulo());
        System.out.print("Paginas totales del libro: ");
        System.out.println(this.getnPage());
        System.out.print("Edicion: ");
        System.out.println(this.getEdicion());
    }
}

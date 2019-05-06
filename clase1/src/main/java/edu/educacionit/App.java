package edu.educacionit;

/**
 * Hello world!
 *
 */
class Usuario {
	String id;
	String nombre;
	public Usuario(String id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}
}

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Usuario u = new Usuario("1","Carlos");
        Object o = new com.google.gson.Gson().toJson(u);
        System.out.println(o);
    }
        
}

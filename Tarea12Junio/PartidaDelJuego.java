import java.util.ArrayList;
/**
 * Class PartidaDelJuego
 */
public class PartidaDelJuego{
	
	private int numPartida;//identificacion de la partida
	private int numJugador;//cantidad de Jugadores
	private String nivelPartida;// tipo dificultad del juego
	private double tiempoPartida;//tiempo en el juego
	public ArrayList<Jugador> participantes;//arrays de participantes tipo Jugador
	public ArrayList<Puntaje> registroPuntajes;//arrays de registos de Puntajes de tipo Puntaje
	
	public PartidaDelJuego(int numPartida, int numJugador, String nivelPartida, double tiempoPartida){//constructor de la clase
		
		this.numPartida=numPartida;
		this.numJugador=numJugador;
		this.nivelPartida=nivelPartida;
		this.tiempoPartida=tiempoPartida;
		participantes = new ArrayList<Jugador>(); // Se instancia una lista de Objetos de tipo Jugador
		registroPuntajes = new  ArrayList<Puntaje>(); // Se instancia una lista de Objetos de tipoPuntaje
		
	}
	
	
	
	
	/* metodos getter*/
	public int getNumPartida(){
		return numPartida;
	}
	
	public int getNumJugador(){
		return numJugador;
	}
	
	public String getNivelPartida(){
		return nivelPartida;
	}
	
	public double getTiempoPartida(){
		return tiempoPartida;
	}
	
	/* metodos setter*/
	public void setNumPartida(int numPartida){
		this.numPartida=numPartida;
	}
	
	public void setNumJugador(int numJugador){
		this.numJugador=numJugador;
	}
	
	public void setNivelPartida(String nivelPartida){
		this.nivelPartida=nivelPartida;
	}
	
	public void setTiempoPartida(double tiempoPartida){
		this.tiempoPartida=tiempoPartida;
	}
	
	
	
	
}
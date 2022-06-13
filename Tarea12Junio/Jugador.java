public class Jugador {
	private String idJugador;
	private String nombreJugador;
	
	public Jugador(String idJugador, String nombreJugador){//constructor de la clase
		this.idJugador=idJugador;
		this.nombreJugador=nombreJugador;
		
	}
	
	/*metodo getter*/
	public String getIdJugador(){
		return idJugador;
	}
	
	public String getNombreJugador(){
		return nombreJugador;
	}
	
	/*metodo setter*/
	public void setIdJugador(String idJugador){
		this.idJugador=idJugador;
	}
	
	public void setNombreJugador(String nombreJugador){
		this.nombreJugador=nombreJugador;
	}

}
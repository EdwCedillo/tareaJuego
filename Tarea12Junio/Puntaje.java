public class Puntaje {
	
	public PartidaDelJuego partidaId;//Se declara variable de tipo PartidaDelJuego 
	public Jugador participante;// Se declara variable de tipo Jugador 
	private int puntos;// Se declara variable de tipo entero para la cantidad de puntos obtenidos del jugador en determinada partida
	
	public Puntaje (PartidaDelJuego partidaId, Jugador participante, int puntos){//constructor de la clase
		this.partidaId=partidaId;
		this.participante=participante;
		this.puntos=puntos;
	}
	
	
	/*metodos getter*/
	public int getPuntaje(){
		return puntos;
	}
	
	/*metodos setter*/
	public void setPuntaje(int puntos){
		this.puntos=puntos;
	}

}
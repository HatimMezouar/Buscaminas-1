package mvc.view;

public class MockMain {
	
		int nivel= 1;
		public int[][] jugada(int partida) {
		int[][]pasos = null;
		switch(partida) {
		case 0:
			//Seleccionamos una bomba en la primera jugada
			pasos= new int[][] {{3, 2, 5}};
			break;
		case 1:
			pasos= new int[][]  {{3, 2, 5},{3,3,4}};
			break;
			}
		return pasos;}
		
		
		public String nombre (int partida) {
			String [] name = {"elpepe", "papo"};
			return name[partida];
	}
	
}

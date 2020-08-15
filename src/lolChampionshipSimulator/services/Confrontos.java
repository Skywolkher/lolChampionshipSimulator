package lolChampionshipSimulator.services;

import java.util.ArrayList;
import java.util.List;
import lolChampionshipSimulator.entities.*;

public class Confrontos {
	
	public List<Resultado> tabelaDeResultados(List<Equipe> equipes, int numeroDeTurnos) {

		List<Resultado> resultados = new ArrayList<Resultado>();
		int iterador = 0;
		do {
			for (Equipe e : equipes) {
				for (int i = 0; i < equipes.size(); i++) {
					if (e != equipes.get(i)) {
						CalculoResultado resultadoDoConfronto = new CalculoResultado();
						Resultado resultado = new Resultado(e, equipes.get(i),
								resultadoDoConfronto.calcularResultado(e, equipes.get(i)));
						resultados.add(resultado);
					}
				}
			}
			iterador++;
		} while (iterador != numeroDeTurnos);
		return resultados;
	}

}

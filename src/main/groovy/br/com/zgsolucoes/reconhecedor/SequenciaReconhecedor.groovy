package br.com.zgsolucoes.reconhecedor

import br.com.zgsolucoes.modelo.Carta
import br.com.zgsolucoes.modelo.Categoria
import br.com.zgsolucoes.reconhecedor.Reconhecedor

class SequenciaReconhecedor extends Reconhecedor {
	
	@Override
	Categoria obtemCategoria(List<Carta> cartas) {
		return isSequencia(cartas) ? Categoria.SEQUENCIA : null
	}
}

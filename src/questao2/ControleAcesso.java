package questao2;

import java.util.List;

public class ControleAcesso {

	private List<VerificaServiceUsuario> listaServices;
	private IdentificaExternoService permissao;

	public ControleAcesso(List<VerificaServiceUsuario> listaServices, IdentificaExternoService permissao) {
		this.listaServices = listaServices;
		this.permissao = permissao;
	}

	Usuario login(Usuario usuario, String cargo) throws AcessoProibidoException {
		for (VerificaServiceUsuario identificaService : listaServices) {
			if (identificaService.isValid(usuario) && permissao.hasHole(usuario, cargo)) {
				return usuario;
			}
		}
		throw new AcessoProibidoException("Acesso Negado");
	}

}

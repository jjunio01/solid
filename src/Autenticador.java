/**
 * @author JJunio
 *
 */
public class Autenticador {

	private UsuarioDAO usuario;

	public boolean autenticarUsuario(String email, String senha) {

		usuario = RecuperarUsuario.porEmail(email);

		if (usuario == null) {
			return false;
		}
		if (ValidarSenhaUsuario.validarSenhaCadastrada(usuario, senha)) {
			usuario.autenticado = true;
			Login.registar(usuario);
			return true;
		}
		return false;
	}
}

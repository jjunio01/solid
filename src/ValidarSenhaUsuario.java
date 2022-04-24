
public class ValidarSenhaUsuario {

	public static boolean validarSenhaCadastrada(UsuarioDAO usuario, String senha) {
		
		if (usuario.getHashSenha() != getHash(senha)) {
			return false;
		}
		return true;
	}

	private static String getHash(String senha) {
		return null;
	}

}

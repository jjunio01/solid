/**
 * @author JJunio
 *
 */
public class RecuperarUsuario {
	
	private static RepositorioUsuarios repositorioUsuarios;
	
	public static UsuarioDAO porEmail(String email) {
		return repositorioUsuarios.getUsuarioPorEmail(email);
		
	}

}


public class Login {

	private static RepositorioUsuarios repositoriosUsuarios;
	public static void registar(UsuarioDAO usuario) {
		repositoriosUsuarios.registraLogin(usuario);
	}

}

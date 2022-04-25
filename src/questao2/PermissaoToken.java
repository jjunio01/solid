package questao2;


public class PermissaoToken implements PermissaoService{

	@Override
	public boolean hasHole(Usuario usuario, String cargo) {
		return false;
	}

}

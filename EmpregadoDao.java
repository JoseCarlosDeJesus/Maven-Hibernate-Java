package semanadepratica.persistence;
import semanadepratica2.model.Empregado;
import java.util.List;

public interface EmpregadoDao {
	public void incluir(Empregado empregado);
	public void alterar(Empregado empregado);
	public void excluir(Empregado empregado);
	public List<Empregado> listarTodos();
	public Empregado buscarPeloCpf(String cpf);
}

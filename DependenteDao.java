package semanadepratica.persistence;
import semanadepratica2.model.Dependente;
import semanadepratica2.model.Empregado;
import java.util.List;

public interface DependenteDao {
	public void incluir(Dependente dependente);
	public void alterar(Dependente dependente);
	public void excluir(Dependente dependente);
	public List<Dependente> listarTodos();
	public Dependente buscarPeloCodigo(int codigo);
	public List<Dependente> buscarPeloEmpregado(Empregado empregado);
}

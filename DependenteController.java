package semanadepratica2.controller;
import semanadepratica.persistence.DependenteDaoImp;
import semanadepratica2.model.Dependente;
import semanadepratica2.model.Empregado;
import java.util.List;

public class DependenteController {
	public void incluir(Dependente dependente) {
		DependenteDaoImp md = new DependenteDaoImp();
		md.incluir(dependente);
	}

	public void alterar(Dependente dependente) {
		DependenteDaoImp md = new DependenteDaoImp();
		md.alterar(dependente);
	}

	public void excluir(Dependente dependente) {
		DependenteDaoImp md = new DependenteDaoImp();
		md.excluir(dependente);
	}

	public List<Dependente> listarTodos() {
		DependenteDaoImp md = new DependenteDaoImp();
		return md.listarTodos();
	}

	public Dependente buscarPeloCodigo(int codigo) {
		DependenteDaoImp md = new DependenteDaoImp();
		return md.buscarPeloCodigo(codigo);
	}

	public List<Dependente> buscarPeloEmpregado(Empregado empregado) {
		DependenteDaoImp md = new DependenteDaoImp();
		return md.buscarPeloEmpregado(empregado);
	}

}

package semanadepratica2.controller;
import semanadepratica2.model.Empregado;
import semanadepratica.persistence.EmpregadoDaoImp;
import java.util.List;

public class EmpregadoController {
	public void incluir(Empregado empregado){
		EmpregadoDaoImp vd = new EmpregadoDaoImp();
		vd.incluir(empregado);
	}
	public void alterar(Empregado empregado) {
		EmpregadoDaoImp vd = new EmpregadoDaoImp();
		vd.alterar(empregado);
	}

	public void excluir(Empregado empregado) {
		EmpregadoDaoImp vd = new EmpregadoDaoImp();
		vd.excluir(empregado);
	}

	public List<Empregado> listarTodos() {
		EmpregadoDaoImp vd = new EmpregadoDaoImp();
		return vd.listarTodos();
	}

	public Empregado buscarPeloCpf(String cpf) {
		EmpregadoDaoImp vd = new EmpregadoDaoImp();
		return vd.buscarPeloCpf(cpf);
	}
}

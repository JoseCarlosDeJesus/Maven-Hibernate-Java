package semanadepratica2.controller;
import semanadepratica2.util.HibernateUtil;
import semanadepratica2.model.Empregado;
import semanadepratica2.model.Dependente;
import java.util.List;
public class Teste {

	public static void main(String[] args) {
		//HibernateUtil.getSessionFactory();
		
		/*
		 * Empregado v = new Empregado(); EmpregadoController vc = new EmpregadoController();
		 * v.setCpf("123478"); v.setNome("Joaquim dos Santos"); v.setIdade("50");
		 * v.setSalario(5000.50); vc.incluir(v);
		 */
		
		/*
		 * Empregado v = new Empregado(); EmpregadoController vc = new EmpregadoController();
		 * v.setCpf("123478"); v.setNome("Joaquim dos Santos"); v.setIdade("55");
		 * v.setSalario(15000.50); vc.alterar(v);
		 */
		
		/*
		 * Empregado v = new Empregado(); EmpregadoController vc = new EmpregadoController();
		 * v.setCpf("12345678"); vc.excluir(v);
		 */
		
		/*
		 * Empregado v = new Empregado(); EmpregadoController vc = new EmpregadoController();
		 * v.setCpf("87654321"); v.setNome("Maria Eduarda"); v.setIdade("20");
		 * v.setSalario(10000.00); vc.incluir(v); v.setCpf("6723521");
		 * v.setNome("Fernando Paz"); v.setIdade("80"); v.setSalario(1000000.00);
		 * vc.incluir(v); v.setCpf("89012121"); v.setNome("Samuel Barros");
		 * v.setIdade("35"); v.setSalario(500.00); vc.incluir(v);
		 */
		
		/*
		 * EmpregadoController vc = new EmpregadoController(); List<Empregado> lista =
		 * vc.listarTodos(); System.out.println(lista); if (lista != null &&
		 * !lista.isEmpty()) { for (Empregado v : lista) { System.out.println(v); } }
		 */
		
		/*
		 * EmpregadoController vc = new EmpregadoController(); Empregado ve =
		 * vc.buscarPeloCpf("12345678"); if(ve != null) { System.out.println(ve); }
		 */
		
		/*
		 * Dependente m = new Dependente(); Empregado v = new Empregado(); DependenteController mc = new
		 * DependenteController(); v.setCpf("12345678"); m.setCodigo(1);
		 * m.setCpf("12345678");
		 * m.setNome("Olinda Ferreira"); m.setGrauParentesco("Filha"); mc.incluir(m); m.setCodigo(2);
		 * m.setNome("João Vitor"); m.GrauParentesco("Irmão");
		 * m.setEmpregado(v); mc.incluir(m); v.setCpf("87654321"); m.setCodigo(3);
		 * m.setNome("Bruno de Goiás"); m.setGrauParentesco("irmão");
		 * m.setVeiculo(v); mc.incluir(m); m.setCodigo(4);
		 * m.setNome("Gustavo Freitas"); m.setGrauParentesco("filho");
		 * m.setVeiculo(v); mc.incluir(m); m.setCodigo(5);
		 * m.setNome("Otto Terra");
		 * m.setGrauParentesco("Professor"); m.setVeiculo(v); mc.incluir(m);
		 */
		
		/*
		 * Dependente m = new Dependente(); Empregado v = new Empregado(); DependenteController mc = new
		 * DependenteController(); v.setCpf("12345678"); m.setCodigo(1);
		 * m.Nome("Olinda dos Passos");
		 * m.setGrauParentesco("mãe"); m.setEmpregado(v); mc.alterar(m);
		 */
		
		/*
		 * Dependente m = new Dependente(); DependenteController mc = new DependenteController();
		 * m.setCodigo(1); mc.excluir(m);
		 */
		
		/*
		 * DependenteController mc = new DependenteController(); List<Dependente> lista =
		 * mc.listarTodos(); if (lista != null) { for (Dependente mu : lista) {
		 * System.out.println("Cpf: " + mu.getEmpregado().getCpf());
		 * System.out.println("Grau Parentesco: " + mu.getGrauParentesco()); } }
		 */
		
		/*
		 * DependenteController mc = new DependenteController(); Dependente mu =
		 * mc.buscarPeloCodigo(3); if (mu != null) { System.out.println("Cpf: " +
		 * mu.getEmpregado().getCpf()); System.out.println("Grau Parentesco: " +
		 * mu.getGrauParentesco()); }
		 */
		
		Empregado v = new Empregado(); v.setCpf("12345678"); DependenteController mc = new
				  DependenteController(); List<Dependente> lista = mc.buscarPeloEmpregado(v); if (lista !=
				  null) { for (Dependente mu : lista) { System.out.println("Placa: " +
				  mu.getEmpregado().getCpf()); System.out.println("GrauParentesco: " +
				  mu.getGrauParentesco()); } }

	}
   
}

package CondoWare2;

import java.util.List;
import java.util.ArrayList;

public class Bancos {
    private static Bancos bancoUnico;
    
    static List<Condominio> bdCondominio;
    static List<Funcionario> bdFuncionario;
    static List<Condomino> bdCondomino;
    static List<AreaDeLazer> bdAreaDeLazer;
    static List<Visitante> bdVisitante;
    static List<Empresas> bdEmpresas;
    static List<Problemas> bdProblemas;
    static List<AreasAlugadas> bdAreasAlugadas;
    
    private Bancos() {
        bdCondominio = new ArrayList<>();
        bdFuncionario = new ArrayList<>();
        bdCondomino = new ArrayList<>();
        bdAreaDeLazer = new ArrayList<>();
        bdVisitante = new ArrayList<>();
        bdEmpresas = new ArrayList<>();
        bdProblemas = new ArrayList<>();
        bdAreasAlugadas = new ArrayList<>();
    }
    
    public static Bancos getBancos() {
        if(bancoUnico == null) {
            bancoUnico = new Bancos();
        }
        return bancoUnico;
    }
    
    public List<Condominio> getBdCondominio(){
        return bdCondominio;
    }
    public List<Funcionario> getBdFuncionario(){
        return bdFuncionario;
    }
    public List<Condomino> getBdCondomino(){
        return bdCondomino;
    }
    public List<AreaDeLazer> getBdAreaDeLazer(){
        return bdAreaDeLazer;
    }
    public List<Visitante> getBdVisitante(){
        return bdVisitante;
    }
    public List<Empresas> getBdEmpresas(){
        return bdEmpresas;
    }
    public List<Problemas> getBdProblemas(){
        return bdProblemas;
    }
    public List<AreasAlugadas> getBdAreasAlugadas(){
        return bdAreasAlugadas;
    }
    
    
    public Condominio addCondominio(Condominio condominio) {
        bdCondominio.add(condominio);
        return condominio;
    }
    
    public Funcionario addFuncionario(Funcionario funcionario) {
        bdFuncionario.add(funcionario);
        return funcionario;
    }
    
    public Condomino addCondomino(Condomino condomino) {
        bdCondomino.add(condomino);
        return condomino;
    }
    
    public AreaDeLazer addAreaDeLazer(AreaDeLazer areaDeLazer) {
        bdAreaDeLazer.add(areaDeLazer);
        return areaDeLazer;
    }
    
    public Visitante addVisitante(Visitante visitante) {
        bdVisitante.add(visitante);
        return visitante;
    }
    
    public Empresas addEmpresas(Empresas empresas) {
        bdEmpresas.add(empresas);
        return empresas;
    }
    
    public Problemas addProblemas(Problemas problemas) {
        bdProblemas.add(problemas);
        return problemas;
    }
    
    public AreasAlugadas addAreasAlugadas(AreasAlugadas areasAlugadas) {
        bdAreasAlugadas.add(areasAlugadas);
        return areasAlugadas;
    }
}

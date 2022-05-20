package Repository;

import Models.DadosReceita;

import java.util.ArrayList;
import java.util.List;


public class DadosReceitaRepository {
    private List<DadosReceita> dadosReceitas;

    public DadosReceitaRepository(){
        this.dadosReceitas = new ArrayList<>();
    }
    public void addDadosReceita(DadosReceita dadosReceita){
        dadosReceitas.add(dadosReceita);
    }
    public List<DadosReceita> consultaReceitas(){
        return dadosReceitas;
    }
}

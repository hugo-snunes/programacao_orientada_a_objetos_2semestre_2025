package Atividade1;

public class Programa {
    private Integer MemoriaRAMalocada;
    private Integer SSDocupado;
    private Integer QuantidadeOperacoes;

public Programa(Integer MemoriaRAMalocada, Integer SSDocupado, Integer QuantidadeOperacoes){
    this.MemoriaRAMalocada = MemoriaRAMalocada;
    this.SSDocupado = SSDocupado;
    this.QuantidadeOperacoes = QuantidadeOperacoes;
    }

    public Integer getMemoriaRAMalocada(){
        return this.MemoriaRAMalocada;
    }

    public void setMemoriaRAMalocada(Integer MemoriaRAMalocada){
        if(MemoriaRAMalocada != null && MemoriaRAMalocada > 0 ){
            this.MemoriaRAMalocada = MemoriaRAMalocada;
        }
    }
    
    public Integer getSSDocupado(){
        return this.SSDocupado;
    }

    public void SSDocupado(Integer SSDocupado){
        if(SSDocupado != null && SSDocupado > 0){
            this.SSDocupado = SSDocupado;
        }
    }

    public Integer getQuantidadeOperacoes(){
        return this.QuantidadeOperacoes;
    }

    public void QuantidadeOperacoes(Integer QuantidadeOperacoes){
        if(QuantidadeOperacoes != null && QuantidadeOperacoes > 0){
            this.QuantidadeOperacoes = QuantidadeOperacoes;
        }
    }

    


}


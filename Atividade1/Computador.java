package Atividade1;

public class Computador {
    public Integer MemoriaRAM;
    public Integer SSD;
    public Integer Nucleos;
    public Float OperacoesPorSegundo;

public Computador(Integer MemoriaRAM, Integer SSD, Integer Nucleos, Float OperacoesPorSegundo){
    this.MemoriaRAM = MemoriaRAM;
    this.SSD = SSD;
    this.Nucleos = Nucleos;
    this.OperacoesPorSegundo = OperacoesPorSegundo;
    }

    public Integer getMemoriaRAM(){
        return this.MemoriaRAM;
    }

    public void setMemoriaRAM(Integer MemoriaRAM){
        if(MemoriaRAM != null && MemoriaRAM <= 8 ){
            this.MemoriaRAM = MemoriaRAM;
        }
    }

    public Integer SSD(){
        return this.SSD;
    }

    public void setSSD(Integer SSD){
        if(SSD != null && SSD <= 512 ){
            this.SSD = SSD;
        }
    }

    public Integer Nucleos(){
        return this.Nucleos;
    }

    public void setNucleos(Integer Nucleos){
        if(Nucleos != null && Nucleos <= 6 ){
            this.Nucleos = Nucleos;
        }
    }

    public Float OperacoesPorSegundo(){
        return this.OperacoesPorSegundo;
    }

    public void setOperacoesPorSegundo(Float OperacoesPorSegundo){
        if(OperacoesPorSegundo != null){
            this.OperacoesPorSegundo = OperacoesPorSegundo;
        }
    }

}
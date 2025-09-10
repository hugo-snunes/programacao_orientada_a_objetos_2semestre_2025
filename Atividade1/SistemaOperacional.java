package Atividade1;

public class SistemaOperacional {
    Computador Computador;
    Programa ExecutarPrograma;


public SistemaOperacional(Computador Computador, Programa ExecutarPrograma){
this.Computador = Computador;
this.ExecutarPrograma = ExecutarPrograma;
}

public Computador getComputador(){
    return this.Computador;
}

public void setComputador(Computador Computador){
        this.Computador = Computador;
}

public Programa getExecutarPrograma(){
    return this.ExecutarPrograma;
}

public void setExecutarPrograma(Programa ExecutarPrograma){
        this.ExecutarPrograma = ExecutarPrograma;
    }
}


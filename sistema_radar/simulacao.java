public class simulacao {
    public static void main(String[] args) {

        Carro opala = 
            new Carro();

        opala.velocidade = 0;
        opala.placa = "ACLR300";
        opala.modelo = "Comodoro";
        opala.ano = 1976;

        Radar radar =
            new Radar();

        radar.modelo = "Pardal";
        radar.limiteVelocidade = 40;
        radar.localizacao = "Pistão Sul";
        
        opala.acelerar(); //5
        opala.acelerar(); //10
        opala.acelerar(); //15
        opala.acelerar(); //20
        opala.acelerar(); //25
        opala.acelerar(); //30
        opala.acelerar(); //35

        opala.acelerar(); //40
            radar.avaliarVelocidade(opala, null);

        opala.acelerar(); //45
            radar.avaliarVelocidade(opala, null);
       

    }
    
}

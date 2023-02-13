public class SmartTV {
    boolean ligada=false;
    int canal=1;
    int volume=25;
    
    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }
        public void aumentarCanal(){
            canal++;
        }
        
        public void diminuirCanal(){
            canal--;
        }
        
        public void aumentarVolume(){
        volume++; //incrementa mais um, mesma coisa de //volume = volume + 1
        System.out.println("Aumentando o Volume para: " + volume);
    }

    public void diminuirVolume(){
        volume--; //decrementa menos um, mesma coisa de //volume = volume - 1
        System.out.println("Diminuindo o Volume para: " + volume);
    }

    public void ligar(){
        ligada=true;
    }

    public void desligar(){
        ligada=false;
    }
}
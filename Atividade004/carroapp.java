public class carroapp {
    public static void main(String[] args) {
        carro carro1 = new carro("FIAT" , "PALIO ");
        carro1.printStatus();
        carro1.acelerar(20);
        carro1.acelerar(50);
        carro1.acelerar(200);
        carro1.printStatus();
        carro1.frear(100);
        carro1.frear(150);
        
        carro1.printStatus();
        
    }

    
}  
    
    


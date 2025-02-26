public class Usuario {
    public static void main(String[] args) {

        SmartTV smartTv = new SmartTV();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> TV ligada? " + smartTv.ligada);

        smartTv.mudarCanal(43);
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        System.out.println("Novo Status -> Canal atual: " + smartTv.canal);
        
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Novo Status -> Volume atual: " + smartTv.volume);

        smartTv.desligar();
        System.out.println("Novo Status -> TV ligada? " + smartTv.ligada);

    }
}

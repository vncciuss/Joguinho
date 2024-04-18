package src;

import Visualizacao.Agradecimentos;

public class Pontos {
    private static long iCronometro = 0;
    private long fCronometro = 0;
    private long dCronometro = 0;
    private int plastico = 100;
    private int papel = 75;
    private int metal = 50;
    private int vidro = 25;
    private int contagem = 0;


    public static void iniciar() {
        iCronometro = System.currentTimeMillis();
    }

    public void darPontuação() {
        fCronometro = System.currentTimeMillis();
        dCronometro = (int)(fCronometro - iCronometro);
        int tempoSegundos = (int) dCronometro / 1000;
    
        plastico = plastico - tempoSegundos;
        papel = papel - contagem;
        metal = metal - contagem;
        vidro = vidro - contagem;
    
        System.out.println("\nParabéns! Suas ações eficientes ajudaram a revitalizar o ambiente urbano, proporcionando um impacto positivo no ecossistema da cidade!\n");
        System.out.println("\nTotal de lixos coletados e devidamente descastados durante a jornada:" + "\nPlásticos:" + plastico + "\nPapeis:" + papel + "\nMetais:" + metal + "\nVidros:" + vidro + "\n");
        System.out.println("\nImpacto ambiental positivo: " + ((plastico * 1) * (papel * 2) * (metal * 3) * (vidro * 4)) + " pontos.");

        Agradecimentos agradecimentos = new Agradecimentos();
        agradecimentos.mostrar();
        System.exit(0);
    }
    
}
package src;

import Visualizacao.Agradecimentos;

public class Pontos {
    private static long iCronometro;
    private long fCronometro;
    private long dCronometro;
    private int plastico = 55;
    private int papel = 40;
    private int metal = 25;
    private int vidro = 10;


    public static void iniciar() {
        iCronometro = System.currentTimeMillis();
    }

    public void darPontuação() {
        fCronometro = System.currentTimeMillis();
        dCronometro = (int)(fCronometro - iCronometro);
        int tempoSegundos = (int) (dCronometro / 1000);
        
        plastico = (plastico + tempoSegundos);
        papel = (papel + tempoSegundos);
        metal = (metal + tempoSegundos);
        vidro = (vidro + tempoSegundos);
        
        System.out.println();
        System.out.println("Parabens! Futuramente suas acoes ajudaram a revitalizar o ambiente urbano, proporcionando um impacto positivo no ecossistema da cidade!");
        System.out.println();
        System.out.println("Total de lixos coletados e devidamente descastados durante sua jornada:" + "\nPlasticos:" + plastico + "\nPapeis:" + papel + "\nMetais:" + metal + "\nVidros:" + vidro);
        System.out.println();
        System.out.println("Impacto ambiental positivo: " + ((plastico) + (papel * 2) + (metal * 3) + (vidro * 4)) + " pontos.");

        Agradecimentos agradecimentos = new Agradecimentos();
        agradecimentos.mostrar();
    }
    
}
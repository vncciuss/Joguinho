package Lugares;

import Minigames.Jogos;
import Visualizacao.CinemaImagem;
import src.Main;

public class Cinema extends Lugar {
    private String nome = "cinema";
    private String pensamento1 = "";
    private String pensamento2 = "";
    private String pensamento3 = "";
    protected static boolean concluido = false;

    public void Viajar() {
        nomeJogador = Main.getNomeJogador();

        CinemaImagem imagem = new CinemaImagem();
        imagem.mostrar();
        System.out.println();
        System.out.println("Você chegou ao " + nome + ".");

        do {
            if (pensamento1.equals("Concluido") && pensamento2.equals("Concluido") && pensamento3.equals("Concluido")) {
                break;
            }

            System.out.println();
            System.out.println("O que você gostaria de fazer?:" + "\n[1] - Escolher um filme para assistir" + "\n[2] - Comprar pipoca e refrigerante, optando por embalagens ecológicas" + "\n[3] - Observar os cartazes dos filmes em cartaz, buscando por documentários sobre conservação ambiental");
            System.out.println();
            System.out.println("Sua escolha: ");
            escolha = scanner.nextLine();

            switch (escolha) {
                case "1":
                    System.out.println();
                    System.out.println("Você escolhe um filme de aventura, que destaca a importância da preservação da natureza.");
                    pensamento1 = "Concluido";
                    break;
                case "2":
                    System.out.println();
                    System.out.println("Você compra uma grande porção de pipoca em uma embalagem de papel reciclado e um refrigerante em uma garrafa retornável, contribuindo para a redução do lixo plástico.");
                    pensamento2 = "Concluido";
                    break;
                case "3":
                    System.out.println();
                    System.out.println("Você observa os cartazes dos filmes em cartaz, buscando por documentários que abordem questões ambientais e de conservação da natureza.");
                    pensamento3 = "Concluido";
                    break;
                default:
                    System.out.println();
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (!escolha.equals("1") || !escolha.equals("2") || !escolha.equals("3"));

        System.out.println();
        System.out.println("O que você gostaria de fazer?:" + "\n[x] - Ir falar com o Atendente do cinema");
        System.out.println();
        System.out.println("Sua escolha: ");
        scanner.nextLine();

        do {
            System.out.println();
            System.out.println("Você deseja falar sobre qual das suas ações?" + "\n[1] - Falar sobre o filme escolhido" + "\n[2] - Falar sobre a comida comprada, mencionando as embalagens ecológicas" + "\n[3] - Falar sobre os cartazes dos filmes, destacando a importância da conscientização ambiental");
            System.out.println();
            System.out.println("Sua escolha: ");
            escolha2 = scanner.nextLine();

            switch (escolha2) {
                case "1":
                    System.out.println();
                    System.out.println(nomeJogador + ": Oi, gostaria de saber mais sobre o filme que escolhi assistir, especialmente sobre as mensagens ambientais que ele pode transmitir.");
                    System.out.println("Atendente do cinema: Claro! Este filme aborda temas como preservação da natureza e responsabilidade ambiental. Espero que você se inspire!");
                    System.out.println(nomeJogador + ": Isso é ótimo, estou ansioso para assistir e aprender mais!");
                    break;
                case "2":
                    System.out.println();
                    System.out.println(nomeJogador + ": Ei, gostaria de elogiar as embalagens ecológicas em que a pipoca e o refrigerante estão sendo vendidos.");
                    System.out.println("Atendente do cinema: Fico feliz que tenha notado! Estamos comprometidos em reduzir nosso impacto ambiental e incentivar práticas mais sustentáveis.");
                    System.out.println(nomeJogador + ": Isso é louvável, espero ver mais iniciativas como essa em outros lugares também!");
                    break;
                case "3":
                    System.out.println();
                    System.out.println(nomeJogador + ": Gostaria de comentar sobre os filmes que abordam questões ambientais. É ótimo ver o cinema promovendo a conscientização sobre a importância da conservação da natureza.");
                    System.out.println("Atendente do cinema: Concordo totalmente! Acreditamos que o cinema pode ser uma poderosa ferramenta de educação e inspiração para proteger o meio ambiente.");
                    System.out.println(nomeJogador + ": Com certeza, espero ver mais filmes com essa temática em cartaz!");
                    break;
                default:
                    System.out.println();
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (!escolha2.equals("2"));

        Jogos minigame = new Jogos();
        minigame.escolherJogo();
        System.out.println();
        System.out.println("Após desfrutar do filme e das iniciativas ecológicas do cinema, você sai com uma sensação de satisfação, sabendo que contribuiu para um mundo mais sustentável.");
        System.out.println();
        System.out.println("O que você gostaria de fazer?:" + "\n[x] - Ir para outro lugar");
        scanner.nextLine();
        concluido = true;
        super.Viajar();

    }

    public static boolean getConcluido() {
        return concluido;
    }
}

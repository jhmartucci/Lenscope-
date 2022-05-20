package Models;

import Repository.DadosReceitaRepository;

import javax.persistence.*;
import java.util.Scanner;
import java.util.UUID;

public class DadosReceita {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private double grauEsfericoEsquerdo;
    @Column(nullable = false)
    private double grauEsfericoDireito;
    @Column(nullable = false)
    private double grauCilindricoDireito;
    @Column(nullable = false)
    private double grauCilindricoEsquerdo;
    private String tipoLenteEsquerda;
    private String tipoLenteDireita;


    DadosReceitaRepository repository = new DadosReceitaRepository();

    public DadosReceita(UUID id,String nome, double grauEsfericoEsquerdo, double grauEsfericoDireito,
                        double grauCilindricoDireito, double grauCilindricoEsquerdo, String tipoLenteEsquerda,
                        String tipoLenteDireita) {
        this.id = id;
        this.nome = nome;
        this.grauEsfericoEsquerdo = grauEsfericoEsquerdo;
        this.grauEsfericoDireito = grauEsfericoDireito;
        this.grauCilindricoDireito = grauCilindricoDireito;
        this.grauCilindricoEsquerdo = grauCilindricoEsquerdo;
        this.tipoLenteEsquerda = tipoLenteEsquerda;
        this.tipoLenteDireita = tipoLenteDireita;
    }

    public DadosReceita() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getGrauEsfericoEsquerdo() {
        return grauEsfericoEsquerdo;
    }

    public void setGrauEsfericoEsquerdo(double grauEsfericoEsquerdo) {
        this.grauEsfericoEsquerdo = grauEsfericoEsquerdo;
    }

    public double getGrauEsfericoDireito() {
        return grauEsfericoDireito;
    }

    public void setGrauEsfericoDireito(double grauEsfericoDireito) {
        this.grauEsfericoDireito = grauEsfericoDireito;
    }

    public double getGrauCilindricoDireito() {
        return grauCilindricoDireito;
    }

    public void setGrauCilindricoDireito(double grauCilindricoDireito) {
        this.grauCilindricoDireito = grauCilindricoDireito;
    }

    public Double getGrauCilindricoEsquerdo() {
        return grauCilindricoEsquerdo;
    }

    public void setGrauCilindricoEsquerdo(Double grauCilindricoEsquerdo) {
        this.grauCilindricoEsquerdo = grauCilindricoEsquerdo;
    }

    public String getTipoLenteEsquerda() {
        return tipoLenteEsquerda;
    }

    public void setTipoLenteEsquerda(String tipoLenteEsquerda) {
        this.tipoLenteEsquerda = tipoLenteEsquerda;
    }

    public String getTipoLenteDireita() {
        return tipoLenteDireita;
    }

    public void setTipoLenteDireita(String tipoLenteDireita) {
        this.tipoLenteDireita = tipoLenteDireita;
    }

    public void getDadosDeEntrada(){
        Scanner scanner = new Scanner(System.in);
        UUID id = UUID.randomUUID();

        System.out.print("Nome Cliente... ");
        String nome =scanner.nextLine().toUpperCase();

        System.out.print("Grau Esférico Olho Esquerdo...: ");
        double grauEsfericoEsquerdo = scanner.nextDouble();
        while (grauEsfericoEsquerdo > 0){
            System.out.println("Favor Digitar números negativos entre 0 e -15");
            System.out.print("Grau Esférico Olho Esquerdo...: ");
            grauEsfericoEsquerdo = scanner.nextDouble();
            while (grauEsfericoEsquerdo > 15 || grauEsfericoEsquerdo < -15 ){
                System.out.println("Informação inválida, são aceitos valores entre 0 e -15");
                System.out.print("Grau Esférico Olho Esquerdo...: ");
                grauEsfericoEsquerdo = scanner.nextDouble();
        }

        }
        System.out.print("Grau Esférico Olho Direito...: ");
        double grauEsfericoDireito = scanner.nextDouble();
        while(grauEsfericoDireito > 0){
            System.out.println("Favor Digitar números negativos entre 0 e -15");
            System.out.print("Grau Esférico Olho Direito...: ");
            grauEsfericoDireito = scanner.nextDouble();
            while (grauEsfericoDireito > 15 || grauEsfericoDireito < -15 ){
                System.out.println("Informação inválida, são aceitos valores entre 0 e -15");
                System.out.print("Grau Esférico Olho Direito...: ");
                grauEsfericoDireito = scanner.nextDouble();
            }
        }

        System.out.print("Grau Cilíndrico Olho Esquerdo...: ");
        double grauCilindricoEsquerdo = scanner.nextDouble();
        while (grauCilindricoEsquerdo > 0){
            System.out.println("Favor Digitar números negativos entre 0 e -6");
            System.out.print("Grau Cilindrico Olho Esquerdo...: ");
            grauCilindricoEsquerdo = scanner.nextDouble();
            while (grauCilindricoEsquerdo > 6 || grauCilindricoEsquerdo < -6 ){
                System.out.println("Informação inválida, são aceitos valores entre 0 e -6");
                System.out.print("Grau Cilindrico Olho Esquerdo...: ");
                grauCilindricoEsquerdo = scanner.nextDouble();
            }
        }

        System.out.print("Grau Cilíndrico Olho Direito...: ");
        double grauCilindricoDireito = scanner.nextDouble();
        while (grauCilindricoDireito > 0){
            System.out.println("Favor Digitar números negativos entre 0 e -6");
            System.out.print("Grau Cilindrico Olho Direito...: ");
            grauCilindricoDireito = scanner.nextDouble();
            while (grauCilindricoDireito > 6 || grauCilindricoDireito < -6 ) {
                System.out.println("Informação inválida, são aceitos valores entre 0 e -6");
                System.out.print("Grau Cilindrico Olho Direito...: ");
                grauCilindricoDireito = scanner.nextDouble();
            }
        }
        if(grauEsfericoEsquerdo <= -3 || grauCilindricoEsquerdo >= -10){
            if(grauCilindricoEsquerdo <= 0 || grauCilindricoEsquerdo >= -2){
                setTipoLenteEsquerda("PRIME");
            }
        }
        if(grauEsfericoEsquerdo <= -3 || grauEsfericoEsquerdo >=-12){
            if(grauCilindricoEsquerdo == 0);
            setTipoLenteEsquerda("PRIME");
        }
        if(grauEsfericoEsquerdo <= 0 || grauEsfericoEsquerdo >= -15){
            if(grauCilindricoEsquerdo >= -5){
                setTipoLenteEsquerda("VISION");
            }
        }
        if(grauEsfericoDireito <= -3 || grauCilindricoDireito >= -10){
            if(grauCilindricoDireito <= 0 || grauCilindricoDireito >= -2){
                setTipoLenteDireita("PRIME");
            }
        }
        if(grauEsfericoDireito <= -3 || grauEsfericoDireito >=-12){
            if(grauCilindricoDireito == 0);
            setTipoLenteDireita("PRIME");
        }
        if(grauEsfericoDireito <= 0 || grauEsfericoDireito >= -15){
            if(grauCilindricoDireito >= -5){
                setTipoLenteEsquerda("VISION");
            }
        }

        DadosReceita dadosReceita = new DadosReceita(id, nome,grauEsfericoEsquerdo,grauEsfericoDireito,
                grauCilindricoEsquerdo,grauCilindricoDireito, tipoLenteEsquerda, tipoLenteDireita);
        repository.addDadosReceita(dadosReceita);
    }
    public void getConsultaReceitas(){
        for(DadosReceita dadosReceita : repository.consultaReceitas()){
            System.out.println("----------------------------------------------");
            System.out.println("ID Receita: " + dadosReceita.getId());
            System.out.println("Nome Cliente: " + dadosReceita.getNome());
            System.out.println("Grau Esférico Olho Esquerdo: " + dadosReceita.getGrauEsfericoEsquerdo());
            System.out.println("Grau Esférico Olho Direito: " + dadosReceita.getGrauEsfericoDireito());
            System.out.println("Grau Cilindrico Olho Esquerdo: " + dadosReceita.getGrauCilindricoEsquerdo());
            System.out.println("Grau Cilindrico Olho Direito: " + dadosReceita.getGrauCilindricoDireito());
            System.out.println("Tipo de Lente Esquerda: " + dadosReceita.getTipoLenteEsquerda());
            System.out.println("Tipo de Lente Direita: " + dadosReceita.getTipoLenteDireita());
        }
    }
}

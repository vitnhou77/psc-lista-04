public class AT04 {
    public static void main(String[] args) {

        double populacaoA = 80000;
        double populacaoB = 200000;
        double taxaCrescimentoA = 0.03;
        double taxaCrescimentoB = 0.015;

        int anos = 0;

        while (populacaoA < populacaoB) {
            populacaoA += populacaoA * taxaCrescimentoA;
            populacaoB += populacaoB * taxaCrescimentoB;
            anos++;
        }

        System.out.println("Número de anos necessários para a população do país A ultrapassar ou igualar a do país B: " + anos);
        System.out.printf("População de A: %.0f\n", populacaoA);
        System.out.printf("População de B: %.0f\n", populacaoB);
    }
}

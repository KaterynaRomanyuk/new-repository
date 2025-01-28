public class UsaProva {
    private Prova prova;

    public UsaProva(){
        prova = new Prova(new AltraClasse("st", 1));
    }

    public void usa(){
        int sum = 1 + prova.num();
        System.out.println(sum);
    }
}

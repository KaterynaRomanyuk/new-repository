

public class Prova{
    private AltraClasse obj;

    public Prova(AltraClasse obj){
        this.obj = obj;
    }

    public void method_to_change(){
        System.out.println(obj.getVar1());
    }

    public void method_added(String text){
        System.out.println(text);
        AltraClasse prova = new AltraClasse(text, 3);
        System.out.println(prova.getVar1());
    }

    public int num(){
        return 2;
    }
}

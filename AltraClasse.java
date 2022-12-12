public class AltraClasse{
    private String var1;
    private int var2;

    public AltraClasse(String st, int i){
        var1 = st;
        var2 = i;
    }

    public String getVar1(){
        int temp = getVar2();
        return var1 + temp;
    }

    public int getVar2(){
        return var2;
    }
}
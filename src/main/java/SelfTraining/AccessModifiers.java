package SelfTraining;

class AccessExample{
    private String privatevar="Private Variable";
    String defaultvar="Default(package-private) Variable";
    protected String protectedvar="Protected Variable";
    public String publicvar="Public Variable";
    private void privateMethod(){
        System.out.println("Private Method");
    }
    void defaultMethod(){
        System.out.println("Default Method");
    }
    protected void protectedMethod(){
        System.out.println("Protected Method");
    }
    public void publicMethod(){
        System.out.println("Public Method");
    }
    public void showPrivateMethod(){
        System.out.println(privatevar);
        privateMethod();
    }
}
class AccessModifiers{
    public static void main(String[] args) {
        AccessExample ae = new AccessExample();
        System.out.println(ae.publicvar);
        ae.publicMethod();
        System.out.println(ae.protectedvar);
        ae.protectedMethod();
        System.out.println(ae.defaultvar);
        ae.defaultMethod();
        ae.showPrivateMethod();
    }
}
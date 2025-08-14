package SelfTraining;
class Banks{
    static String bankName;
    static int totalAccounts=0;
    String accountHolder;
    static{
        System.out.println("Static Block: setting up Bank");
        bankName="Global Trust Bank";
    }
    Banks(String name){
        accountHolder=name;
        totalAccounts++;
        System.out.println("Account created for:" +accountHolder);
    }
    static void bankInfo(){
        System.out.println("Bank Name: "+bankName);
        System.out.println("Total Accounts: "+totalAccounts);
    }
}
public class StaticKeywordAndBlocks {
    public static void main(String[] args) {
        Banks.bankInfo();
        Banks b1 = new Banks("Raji");
        Banks b2 = new Banks("Hari");
        Banks.bankInfo();
    }
}
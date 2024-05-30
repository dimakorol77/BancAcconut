public class Program {
    public static void main(String[] args) {
        Address address1 = new Address("New York", "USA", "93792","Wall Street","85");
        Address address2 = new Address("Washington", "USA", "93157","Massachusetts Avenue","11");
        User user1= new User("Jason", "Bourne", address1);
        BankAccount bankAccount1= new BankAccount(user1, 700000);


        bankAccount1.deposit(50000);
        bankAccount1.withdraw(25000);
        System.out.println(bankAccount1.getBalance());
        System.out.println(user1.getFullName());
        user1.setAddress(address2);
        System.out.println(user1.getFullName());

    }
}

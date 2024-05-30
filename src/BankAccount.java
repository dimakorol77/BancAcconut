public class BankAccount {
    private User user;
    private double balance;

    public BankAccount(User user, double balance) {
        if (user == null || user.getFirstname().isEmpty() || user.getLastname().isEmpty()) {
            throw new IllegalArgumentException("Имя и фамилия пользователя не могут быть пустыми");
        }
        if (balance < 0) {
            throw new IllegalArgumentException("Начальный баланс не может быть отрицательным");
        }
        this.user = user;
        this.balance = balance;
        user.addBankAccount(this);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        } else System.out.println("Вносимая сумма должна быть больше чем 0");
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
        } else System.out.println("Сумма для снятия должна быть больше 0 и меньше вашего текущего баланса");
    }

    //Измените метод getBalance(), чтобы он выводил сообщение вида: "Баланс счета [Полное имя пользователя]: [Баланс]"
    public String getBalance() {
        return "Баланс счета " + user.getFirstname() + " " + user.getLastname() + " :" + balance;

    }


    public User getUser() {
        return user;
    }

    //Добавьте возможность начисления процентов на остаток счета с помощью метода addInterest(rate),
    // где rate - годовая процентная ставка.
    public void addInterest(double rate) {
        balance = balance + (balance * rate / 100);

    }

}
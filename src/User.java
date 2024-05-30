import java.util.ArrayList;
import java.util.List;

public class User {
    private String firstname;
    private String lastname;
    private Address userAddress;
    private List<BankAccount> bankAccounts;

    public User(String firstname, String lastname, Address userAddress) {
        if (firstname == null || firstname.isEmpty()) {
            throw new IllegalArgumentException("Имя не может быть пустым или null");
        }
        if (lastname == null || lastname.isEmpty()) {
            throw new IllegalArgumentException("Фамилия не может быть пустой или null");
        }
        if (userAddress == null ) {
            throw new IllegalArgumentException("Адрес не может быть пустым или null");
        }
        this.firstname = firstname;
        this.lastname = lastname;
        this.userAddress = userAddress;
        this.bankAccounts = new ArrayList<>();
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        if (firstname == null || firstname.isEmpty()) {
            throw new IllegalArgumentException("Имя не может быть пустым или null");
        }
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        if (lastname == null || lastname.isEmpty()) {
            throw new IllegalArgumentException("Фамилия не может быть пустой или null");
        }

        this.lastname = lastname;
    }
    public void addBankAccount(BankAccount account){
        if (account==null) {
            throw new IllegalArgumentException("Аккаунт не может быть пустым");
        }
        bankAccounts.add(account);
    }

    public List<BankAccount> getBankAccounts() {
        return bankAccounts;
    }

    public Address getAddress() {
        return userAddress;
    }

    public void setAddress(Address userAddress) {
        if (userAddress == null) {
            throw new IllegalArgumentException("Адрес не может быть null");
        }
        this.userAddress = userAddress;
    }


    public String getFullName() {
        return "Полное имя: " + this.firstname + " " + this.lastname +", Адрес: "+ userAddress.getFullAddress();
    }
    //

}

import java.util.ArrayList;
import java.util.List;

public class User {
    private String firstname;
    private String lastname;
    private List<Address> addresses;
    private List<BankAccount> bankAccounts;

    public User(String firstname, String lastname, Address userAddress) {
        if (firstname == null || firstname.isEmpty()) {
            throw new IllegalArgumentException("Имя не может быть пустым или null");
        }
        if (lastname == null || lastname.isEmpty()) {
            throw new IllegalArgumentException("Фамилия не может быть пустой или null");
        }
        if (userAddress == null) {
            throw new IllegalArgumentException("Адрес не может быть пустым или null");
        }
        this.firstname = firstname;
        this.lastname = lastname;
        this.addresses = new ArrayList<>();
        this.addresses.add(userAddress);
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

    public void addBankAccount(BankAccount account) {
        if (account == null) {
            throw new IllegalArgumentException("Аккаунт не может быть пустым");
        }
        bankAccounts.add(account);
    }

    public List<BankAccount> getBankAccounts() {
        return bankAccounts;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void addAddress(Address address) {
        if (address == null) {
            throw new IllegalArgumentException("Адрес не может быть null");
        }
        addresses.add(address);
    }

    public void updateAddress(Address newAddress) {
        if (newAddress == null) {
            throw new IllegalArgumentException("Адрес не может быть null");
        }
        this.addresses.add(newAddress);
    }

    public String getFullName() {
        StringBuilder fullAddress = new StringBuilder();
        for (Address address : addresses) {
            fullAddress.append(address.getFullAddress()).append("; ");
        }
        return "Полное имя: " + this.firstname + " " + this.lastname + ", Адреса: " + fullAddress.toString();
    }
}

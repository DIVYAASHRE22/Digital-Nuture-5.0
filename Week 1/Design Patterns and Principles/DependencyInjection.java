//Exercise 11
interface CustomerRepository {
    String findCustomerById(int id);
}
class CustomerRepositoryImpl implements CustomerRepository {
    public String findCustomerById(int id) {
        return "Customer ID: " + id;
    }
}
class CustomerService {
    private CustomerRepository repository;
    CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }
    void getCustomer(int id) {
        System.out.println(repository.findCustomerById(id));
    }
}
public class DependencyInjection {
    public static void main(String[] args) {
        CustomerRepository repo = new CustomerRepositoryImpl();
        CustomerService service = new CustomerService(repo);
        service.getCustomer(101);
    }
}
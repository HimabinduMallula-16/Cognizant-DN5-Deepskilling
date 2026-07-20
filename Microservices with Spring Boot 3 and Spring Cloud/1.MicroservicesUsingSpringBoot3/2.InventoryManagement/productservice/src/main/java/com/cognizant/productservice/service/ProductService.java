@Service
public class ProductService {

    @Autowired
    ProductRepository repository;

    public Product save(Product product){
        return repository.save(product);
    }

    public List<Product> getAll(){
        return repository.findAll();
    }
}
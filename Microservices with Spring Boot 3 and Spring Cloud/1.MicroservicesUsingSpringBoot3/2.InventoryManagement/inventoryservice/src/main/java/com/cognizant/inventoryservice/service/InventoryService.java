@Service
public class InventoryService {

    @Autowired
    InventoryRepository repository;

    public Inventory save(Inventory inventory){
        return repository.save(inventory);
    }

    public List<Inventory> getAll(){
        return repository.findAll();
    }
}
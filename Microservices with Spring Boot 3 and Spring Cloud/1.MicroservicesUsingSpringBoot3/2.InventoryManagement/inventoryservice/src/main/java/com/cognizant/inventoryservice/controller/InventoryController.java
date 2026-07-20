@RestController
@RequestMapping("/inventory")
public class InventoryController {

    @Autowired
    InventoryService service;

    @PostMapping
    public Inventory save(@RequestBody Inventory inventory){
        return service.save(inventory);
    }

    @GetMapping
    public List<Inventory> getAll(){
        return service.getAll();
    }
}
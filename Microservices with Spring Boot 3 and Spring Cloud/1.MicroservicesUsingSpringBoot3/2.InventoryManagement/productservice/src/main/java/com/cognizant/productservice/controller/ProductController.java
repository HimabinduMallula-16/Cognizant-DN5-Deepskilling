@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService service;

    @PostMapping
    public Product save(@RequestBody Product p){
        return service.save(p);
    }

    @GetMapping
    public List<Product> getAll(){
        return service.getAll();
    }
}
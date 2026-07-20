@Entity
public class Inventory {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private Long productId;

    private int quantity;

    // getters setters
}
@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer roll;
	private String name;
	private Integer marks;
	
	@Embedded
	private Address addr;
	
	@JsonIgnore
	@ManyToMany(cascade = CascadeType.ALL)
	private Set<Course> courses= new HashSet<>();
	
}

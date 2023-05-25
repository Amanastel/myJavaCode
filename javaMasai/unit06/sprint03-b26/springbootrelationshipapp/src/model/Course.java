@Entity
@Data  // @Getter and @Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Course {


	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer courseId;
	private String courseName;
	private Integer fee;
	private String desc;
	
	
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "courses")
	private Set<Student> students= new HashSet<>();

		
}

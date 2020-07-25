package {{cookiecutter.package}}.data;

import javax.persistence.*;
import java.time.Instant;
import java.util.UUID;

@MappedSuperclass
public class BaseModel {
    @Id
    @GeneratedValue
    @Column(columnDefinition = "uuid", updatable = false)
    private UUID id;

    @Column
    private String name;

    @Column
    private String alternateName;

    @Column
    private String description;

    @Column
    @OneToOne
    private User creator;

    @Column
    private Instant created;

    @Column
    private Instant modified;

}

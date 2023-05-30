package pe.example.cibertec.pregunta3.Model;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Data
@Table(name = "especialidad")
public class Especialidad {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idesp;

    @Column(name = "nomesp")
    private String nomesp;

    @Column(name = "costo")
    private String costo;

    @JsonManagedReference
    @OneToMany(mappedBy = "especialidad",
            cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Alumno> listaalumno = new ArrayList<>();
}

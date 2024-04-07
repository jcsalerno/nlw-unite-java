package rocketseat.com.passin.domain.attendee;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter; // Importação adicionada
import rocketseat.com.passin.domain.event.Event;

import java.time.LocalDateTime;

@Entity
@Table(name = "attendees")
@Getter
@Setter // Anotação adicionada para gerar o método setter
@AllArgsConstructor
@NoArgsConstructor
public class Attendee {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @ManyToOne
    @JoinColumn(name = "event_id", nullable = false)
    private Event event;

    @Column(name = "created_at") // Corrigido o nome do campo "created_at"
    private LocalDateTime createdAt;

    // Método setter adicionado para o atributo "name"
    public void setName(String name) {
        this.name = name;
    }
}

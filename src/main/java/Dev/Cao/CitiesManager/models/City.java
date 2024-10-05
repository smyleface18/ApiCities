package Dev.Cao.CitiesManager.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "city")
@Getter
@Setter
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "NAME")
    private String name;


    @Column(name = "DISTRICT")
    private String district;

    @Column(name = "POPULATION")
    private Long population;

    @Column(name = "img")
    private String img;
}

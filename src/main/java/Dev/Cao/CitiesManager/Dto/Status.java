package Dev.Cao.CitiesManager.Dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Status {
    private String name;
    private String description;

    public Status(String name,String description) {
        this.description = description;
        this.name = name;
    }
}

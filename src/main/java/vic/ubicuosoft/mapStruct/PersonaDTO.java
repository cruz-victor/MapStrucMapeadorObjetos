package vic.ubicuosoft.mapStruct;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonaDTO {
    private String nombre;
    private String apellidos;
    private Integer edad;
}

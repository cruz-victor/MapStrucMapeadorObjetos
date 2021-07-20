package vic.ubicuosoft.mapStruct;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClienteDTO {
    private String nombreCliente;
    private String apellidosCliente;
    private Integer edad;
}

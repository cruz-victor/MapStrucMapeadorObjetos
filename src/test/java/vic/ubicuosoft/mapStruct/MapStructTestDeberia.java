package vic.ubicuosoft.mapStruct;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import vic.ubicuosoft.mapStruct.mappers.IClienteMapper;
import vic.ubicuosoft.mapStruct.mappers.IPersonaMapper;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Slf4j
@SpringBootTest
class MapStructTestDeberia {

    @Test
    void test_map_struct_nombres_atributos_iguales() {
        Persona persona=new Persona("Victor","Cruz Gomez",30);

        PersonaDTO personaDTO= IPersonaMapper.INSTANCIA.personaToPersonaDto(persona);

        System.out.println("Persona--->"+persona);
        System.out.println("PersonaDTO--->"+personaDTO);

        assertEquals("Victor", personaDTO.getNombre());
        assertEquals("Cruz Gomez", personaDTO.getApellidos());
    }

    @Test
    void test_map_struct_nombres_atributos_diferentes() {
        assertTrue(true);

        Persona persona=new Persona("Victor","Cruz Gomez",30);

        ClienteDTO clienteDTO= IClienteMapper.INSTANCIA.personaToClienteDto(persona);

        System.out.println("Persona--->"+persona);
        System.out.println("ClienteDTO--->"+clienteDTO);

        assertEquals("Victor", clienteDTO.getNombreCliente());
        assertEquals("Cruz Gomez", clienteDTO.getApellidosCliente());
    }
}
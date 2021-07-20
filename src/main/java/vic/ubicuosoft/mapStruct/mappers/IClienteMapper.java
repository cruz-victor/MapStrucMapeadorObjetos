package vic.ubicuosoft.mapStruct.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import vic.ubicuosoft.mapStruct.ClienteDTO;
import vic.ubicuosoft.mapStruct.Persona;

@Mapper(componentModel = "spring")
public interface IClienteMapper {
    IClienteMapper INSTANCIA= Mappers.getMapper(IClienteMapper.class);

    @Mapping(source="nombre", target="nombreCliente")
    @Mapping(source="apellidos", target="apellidosCliente")
    ClienteDTO personaToClienteDto(Persona persona);
}

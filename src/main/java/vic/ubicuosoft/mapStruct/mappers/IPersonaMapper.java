package vic.ubicuosoft.mapStruct.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import vic.ubicuosoft.mapStruct.Persona;
import vic.ubicuosoft.mapStruct.PersonaDTO;

@Mapper(componentModel = "spring")
public interface IPersonaMapper {
    IPersonaMapper INSTANCIA= Mappers.getMapper(IPersonaMapper.class);
    PersonaDTO personaToPersonaDto(Persona persona);
}

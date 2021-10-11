package one.digitalinnovation.personapi.utils;

import one.digitalinnovation.personapi.dto.request.PhoneDTO;
import one.digitalinnovation.personapi.entity.Phone;

public class PhoneUtils {

    private static final String NUMBER = "13997276821";
    private static final Long ID = 1l;


    public static PhoneDTO createFakeDTO(){
        return PhoneDTO.builder()
                .id(ID)
                .number(NUMBER).build();
    }

    public static Phone createFakeEntity(){
        return Phone.builder()
                .id(ID)
                .number(NUMBER).build();
    }
}

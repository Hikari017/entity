package pl.japonics.newspring.models;

import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by Justyna on 29.05.2017.
 */
//bean - rozproszenie infastruktury  SPRINGA

@Service
public class SimpleBean {
    public String generateString(){
        return UUID.randomUUID().toString();
    }
}

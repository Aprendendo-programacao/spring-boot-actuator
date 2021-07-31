package me.gabreuw.spring_boot_actuator.monitoring;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Endpoint(id = "custom")
@Component
public class CustomActuatorEndpoint {

    @ReadOperation
    public Object customEndpoint(String username) {
        return new HashMap<String, String>() {{
            put("Key", "Value");
            put("Username", username);
        }};
    }

}

package endpoints;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EndpointRegistry {

    private static final Map<String, EndpointDefinition> endpoints = new HashMap<>();

    static {
        endpoints.put("user", new EndpointDefinition( "/user/{username}", List.of("GET", "PUT", "DELETE") ));
        endpoints.put("login", new EndpointDefinition( "/user/login", List.of("GET") ));
        endpoints.put("pet", new EndpointDefinition("/pet", List.of("GET", "PUT", "POST") ));
        endpoints.put("petId", new EndpointDefinition(/pet/{petId}, List.of("GET", "PUT", "POST") ));
        endpoints.put("store" new EndpointDefinition( /store/order/{orderId}, List.of("GET", "DELETE")));
        endpoints.put("store" new EndpointDefinition( /store/order , List.of("POST")));
        endpoints.put("store" new EndpointDefinition( /store/inventory , List.of("GET")));

    }

    public static EndpointDefinition get(String name) {
        return endpoints.get(name);
    }
}

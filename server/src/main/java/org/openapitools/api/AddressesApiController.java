package org.openapitools.api;

import org.openapitools.model.Address;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.*;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-15T21:55:00.089+01:00[Europe/Berlin]")
@Controller
@RequestMapping("${openapi.addressService.base-path:}")
public class AddressesApiController implements AddressesApi {

    private final NativeWebRequest request;

    @Autowired
    public AddressesApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<List<Address>> addressesGet() {
        Address item1 = new Address();
        item1.setState("Hamburg");
        item1.setCity("Hamburg");
        item1.setPostCode(22087);
        item1.setStreet("Boxhagener Str.");
        item1.setHouseNumber("7");
        Address item2 = new Address();
        item2.setState("Nordrhein-Westfalen");
        item2.setCity("Gelsenkirchen");
        item2.setPostCode(45896);
        item2.setStreet("Friedrichstrasse");
        item2.setHouseNumber("48");

        return ResponseEntity.ok(Arrays.asList(item1, item2));
    }
}

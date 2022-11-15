package org.openapitools.api;

import org.openapitools.model.Address;
import org.openapitools.model.AddressInfo;
import org.openapitools.model.AddressesInner;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.context.request.NativeWebRequest;

import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-12T21:32:54.191+01:00[Europe/Berlin]")
@Controller
@RequestMapping("${openapi.addressService.base-path:}")
public class AddressApiController implements AddressApi {

    private final NativeWebRequest request;

    @Autowired
    public AddressApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<List<Address>> addressGet() {
        int i = 0;
        Address item1 = new Address();
        Address item2 = new Address();
        item1.setId(i=i+1);
        item1.setCity("Gossersweiler-stein");
        item1.setPostCode(76857);
        item1.setStreet("Brandenburgische Strasse");
        item1.setHouseNumber("50");
        item2.setId(i=i+1);
        item2.setCity("Gossersweiler-stein");
        item2.setPostCode(76857);
        item2.setStreet("Brandenburgische Strasse");
        item2.setHouseNumber("50");
    return ResponseEntity.ok(Arrays.asList(item1, item2));
    }

}

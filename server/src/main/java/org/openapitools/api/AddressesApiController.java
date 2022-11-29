package org.openapitools.api;

import org.openapitools.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-29T21:54:44.884+01:00[Europe/Berlin]")
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
        item1.setCity("Test");

        return ResponseEntity.ok(Arrays.asList(item1));
    }

}

/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.2.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.Address;
import org.openapitools.model.AddressInfo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-29T22:42:23.098+01:00[Europe/Berlin]")
@Validated
@Tag(name = "addresses", description = "the addresses API")
public interface AddressesApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /addresses
     * Get a list of all addresses
     *
     * @return Success! (status code 200)
     */
    @Operation(
        operationId = "addressesGet",
        tags = { "addresses" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Success!", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Address.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/addresses",
        produces = { "application/json" }
    )
    default ResponseEntity<List<Address>> addressesGet(
        
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "null";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /addresses/{id}
     * Delete Address by ADID
     *
     * @param id  (required)
     * @return Successfully deleted the Address (status code 200)
     */
    @Operation(
        operationId = "addressesIdDelete",
        tags = { "addresses" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successfully deleted the Address")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/addresses/{id}"
    )
    default ResponseEntity<Void> addressesIdDelete(
        @Parameter(name = "id", description = "", required = true) @PathVariable("id") Integer id
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /addresses/{id}
     *
     * @param id  (required)
     * @return Success Response with Path Parameter (status code 200)
     */
    @Operation(
        operationId = "addressesIdGet",
        tags = { "addresses" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Success Response with Path Parameter", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Address.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/addresses/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<Address> addressesIdGet(
        @Parameter(name = "id", description = "", required = true) @PathVariable("id") Integer id
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "null";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PATCH /addresses/{id}
     *
     * @param id  (required)
     * @param addressInfo  (optional)
     * @return Successfully changed data of address with id: {id} (status code 200)
     */
    @Operation(
        operationId = "addressesIdPatch",
        tags = { "addresses" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successfully changed data of address with id: {id}")
        }
    )
    @RequestMapping(
        method = RequestMethod.PATCH,
        value = "/addresses/{id}",
        consumes = { "application/json" }
    )
    default ResponseEntity<Void> addressesIdPatch(
        @Parameter(name = "id", description = "", required = true) @PathVariable("id") Integer id,
        @Parameter(name = "AddressInfo", description = "") @Valid @RequestBody(required = false) AddressInfo addressInfo
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /addresses
     * Add a new Person
     *
     * @param addressInfo  (optional)
     * @return Successfully added (status code 201)
     */
    @Operation(
        operationId = "addressesPost",
        tags = { "addresses" },
        responses = {
            @ApiResponse(responseCode = "201", description = "Successfully added")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/addresses",
        consumes = { "application/json" }
    )
    default ResponseEntity<Void> addressesPost(
        @Parameter(name = "AddressInfo", description = "") @Valid @RequestBody(required = false) AddressInfo addressInfo
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}

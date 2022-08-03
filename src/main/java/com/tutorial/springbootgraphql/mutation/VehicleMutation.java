package com.tutorial.springbootgraphql.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.tutorial.springbootgraphql.model.Vehicle;
import com.tutorial.springbootgraphql.service.VehicleService;
import org.springframework.stereotype.Component;


@Component
public class VehicleMutation implements GraphQLMutationResolver {

    private final VehicleService vehicleService;

    public VehicleMutation(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    public Vehicle createVehicle(final String type, final String modelCode, final String brandName, final String launchDate) {
        return this.vehicleService.createVehicle(type, modelCode, brandName, launchDate);
    }
}
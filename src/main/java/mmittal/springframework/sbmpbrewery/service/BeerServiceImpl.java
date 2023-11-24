package mmittal.springframework.sbmpbrewery.service;

import mmittal.springframework.sbmpbrewery.web.model.BeerDto;

import java.util.UUID;

public class BeerServiceImpl implements BeerService{
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ale")
                .build();
    }
}

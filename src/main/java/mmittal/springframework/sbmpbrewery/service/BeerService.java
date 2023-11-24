package mmittal.springframework.sbmpbrewery.service;

import mmittal.springframework.sbmpbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {

    BeerDto getBeerById(UUID beerId);
}

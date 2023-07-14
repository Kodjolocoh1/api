package com.pokemonreview.api.service;

import com.pokemonreview.api.dto.ClubDto;

import java.util.List;

public interface ClubService {
    List<ClubDto>  findAllClubs();
}

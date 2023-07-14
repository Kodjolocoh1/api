package com.pokemonreview.api.service;

import com.pokemonreview.api.dto.ClubDto;
import com.pokemonreview.api.model.Club;
import com.pokemonreview.api.repository.ClubRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class ClubImplementation implements ClubService{

    private final ClubRepository clubRepository;

    @Override
    public List<ClubDto> findAllClubs() {
        List<Club> clubs = clubRepository.findAll();
        return clubs.stream().map((club) -> mapToClubDto(club)).collect(Collectors.toList());
    }

    private ClubDto mapToClubDto(Club club) {
        ClubDto clubDto = ClubDto.builder()
                .id(club.getId())
                .content(club.getContent())
                .title(club.getTitle())
                .photoUrl(club.getPhotoUrl())
                .createdOn(club.getCreatedOn())
                .updatedOn(club.getUpdatedOn())
                .build();
        return clubDto;
    }
}

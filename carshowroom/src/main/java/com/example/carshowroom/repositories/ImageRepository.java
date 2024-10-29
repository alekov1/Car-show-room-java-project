package com.example.carshowroom.repositories;

import com.example.carshowroom.models.Image;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

@Transactional
public interface ImageRepository extends JpaRepository<Image, Long> {
}

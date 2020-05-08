package com.acme.keeper.repository;

import com.acme.keeper.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {
    // Includes methods like save(), findOne(), findAll(), count()
}

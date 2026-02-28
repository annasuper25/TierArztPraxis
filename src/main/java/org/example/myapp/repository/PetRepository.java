package org.example.myapp.repository;

import org.example.myapp.model.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long> {
    // Hier können bei Bedarf zusätzliche Methoden für Datenbankabfragen hinzugefügt werden.
}

package org.example.myapp.repository;

import org.example.myapp.model.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepository extends JpaRepository<Owner, Long> {
// Hier können bei Bedarf zusätzliche Methoden für Datenbankabfragen hinzugefügt werden.
}

package com.lastsys.hexagonal.occ_clone.domain.ports.out.record;

import com.lastsys.hexagonal.occ_clone.domain.models.Record;

import java.util.List;
import java.util.Optional;

public interface RecordRepositoryPort {
    Record save(Record record);
    Optional<Record> findById(Long id);
    List<Record> findAll();
    Optional<Record> update(Record record);
    boolean deleteById(Long id);
}

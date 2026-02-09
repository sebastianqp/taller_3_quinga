package org.example.buildtestcit.repository;


import org.example.buildtestcit.model.Wallet;

import java.util.Optional;

public interface WalletRepository {
    Wallet save (Wallet wallet);
    Optional<Wallet> findById(String id);
    boolean existsByOwnerEmail(String ownerEmail);
}

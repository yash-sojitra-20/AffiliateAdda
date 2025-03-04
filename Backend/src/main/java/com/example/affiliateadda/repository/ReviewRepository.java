package com.example.affiliateadda.repository;

import com.example.affiliateadda.model.Product;
import com.example.affiliateadda.model.Review;
import com.example.affiliateadda.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public interface ReviewRepository extends JpaRepository<Review, Long> {
    Optional<Review> findByUserAndProduct(User user, Product product); // Find existing review by user and product
    List<Review> findByProduct(Product product); // Find all reviews for a product

    List<Review> findByUser(User user);
}


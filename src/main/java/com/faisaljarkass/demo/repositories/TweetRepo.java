package com.faisaljarkass.demo.repositories;

import com.faisaljarkass.demo.domains.TweetString;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TweetRepo extends JpaRepository<TweetString, Integer> {
    public List<TweetString> findAllByOrderByIdDesc();

}

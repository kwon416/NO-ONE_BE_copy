package com.techconnection.noone.biz.inquiry.repository;

import com.techconnection.noone.biz.inquiry.domain.Inquiry;
import com.techconnection.noone.biz.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InquiryRepository extends JpaRepository<Inquiry, Long> {
    List<Inquiry> findAllByEmail(String email);


}

package com.learn.repo;

import com.learn.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface UserRepository extends CrudRepository <User,String>
{
}

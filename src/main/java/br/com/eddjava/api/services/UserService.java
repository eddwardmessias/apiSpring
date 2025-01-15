package br.com.eddjava.api.services;

import br.com.eddjava.api.domain.User;

public interface UserService {
    User findById(Integer id);
}

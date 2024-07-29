package taispestana.dio.santander_dev_week_2023.service;

import taispestana.dio.santander_dev_week_2023.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create (User userToCreate);
}

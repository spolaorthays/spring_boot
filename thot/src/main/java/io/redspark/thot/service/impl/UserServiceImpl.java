package io.redspark.thot.service.impl;

import io.redspark.thot.controller.dto.UserDTO;
import io.redspark.thot.model.User;
import io.redspark.thot.repository.UserRepository;
import io.redspark.thot.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    public UserServiceImpl(UserRepository userRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public UserDTO create(UserDTO userDTO) {
        User user = modelMapper.map(userDTO, User.class);

        userRepository.save(user);

        return modelMapper.map(user, UserDTO.class);
    }

    @Override
    public List<UserDTO> findAll() {
        return userRepository.findAll()
                .stream()
                .map(user -> modelMapper.map(user, UserDTO.class))
                .collect(Collectors.toList());
    }
}

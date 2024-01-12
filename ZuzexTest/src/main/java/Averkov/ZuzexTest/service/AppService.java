package Averkov.ZuzexTest.service;

import Averkov.ZuzexTest.model.House;
import Averkov.ZuzexTest.model.User;
import Averkov.ZuzexTest.repository.HouseRepository;
import Averkov.ZuzexTest.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AppService {
    UserRepository userRepository;
    HouseRepository houseRepository;
    public User getUser(long userId) {
        Optional user = userRepository.findById(userId);
        if (user.isPresent()) return (User) user.get();
        System.out.println("User not found");
        return null;
    }

    public void createUser(User user) {
        userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    public void updateUser(User user) {
        userRepository.save(user);
    }


    public House getHouse(long houseId) {
        Optional house = houseRepository.findById(houseId);
        if (house.isPresent()) return (House) house.get();
        System.out.println("House not found");
        return null;
    }

    public void createHouse(House house) {
        houseRepository.save(house);
    }

    public void updateHouse(House house) {
        houseRepository.save(house);
    }

    public void deleteHouse(Long id) {
        houseRepository.deleteById(id);
    }

    public void addTenant(House house, Long userId) {
        HashSet<Long> tenants = (HashSet<Long>) house.getTenants();
        tenants.add(userId);
        house.setTenants(tenants);
        updateHouse(house);
    }
}

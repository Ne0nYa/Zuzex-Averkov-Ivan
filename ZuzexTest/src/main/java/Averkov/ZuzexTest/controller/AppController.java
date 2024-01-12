package Averkov.ZuzexTest.controller;

import Averkov.ZuzexTest.model.House;
import Averkov.ZuzexTest.model.User;
import Averkov.ZuzexTest.service.AppService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping()
@RequiredArgsConstructor
public class AppController {

    private final AppService appService;

    @GetMapping("/getUser/{userId}")
    public User getUser(@PathVariable("userId") long userId) {
        return appService.getUser(userId);
    }

    @PostMapping("/createUser")
    public void createUser(User user) {
        appService.createUser(user);
    }

    @PostMapping("/updateUser")
    public void updateUser(User user) {
        appService.updateUser(user);
    }

    @DeleteMapping ("/deleteUser")
    public void deleteUser(Long id) {
        appService.deleteUser(id);
    }

    @GetMapping("/getHouse/{userId}")
    public House getHouse(@PathVariable("houseId") long houseId) {
        return appService.getHouse(houseId);
    }

    @PostMapping("/createHouse")
    public void createHouse(House house) {
        appService.createHouse(house);
    }

    @PostMapping("/updateHouse")
    public void updateHouse(House house) {
        appService.updateHouse(house);
    }

    @DeleteMapping ("/deleteHouse")
    public void deleteHouse(Long id) {
        appService.deleteHouse(id);
    }

    @PostMapping("/updateHouse")
    public void addTenant(House house, Long userId) {
        appService.addTenant(house, userId);
    }
}

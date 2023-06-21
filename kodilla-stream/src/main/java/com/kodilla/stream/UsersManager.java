package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        processUserStream();

        List<String> chemistGroupUserNames = filterChemistGroupUsernames();
        System.out.println(chemistGroupUserNames);
    }

    private static void processUserStream() {
        UserRepository.getUserList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .forEach(username -> System.out.println(username));
    }

    public static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UserRepository.getUserList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
        return usernames;
    }
    public static List<String> filterAgeUsernames(int age) {
        List<String> usernames = UserRepository.getUserList()
                .stream()
                .filter(user -> user.getAge() > age)
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
        return usernames;
    }
    public static List<String> filterAgeGroupUsernames(String group,int age) {
        List<String> usernames = UserRepository.getUserList()
                .stream()
                .filter(user -> user.getGroup().equals(group))
                .filter(user -> user.getAge() > age)
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
        return usernames;
    }
    public static String getUserName(User user){
        return user.getUserName();
    }
}

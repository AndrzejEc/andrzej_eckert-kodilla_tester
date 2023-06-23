package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UserRepository;

import java.util.ArrayList;
import java.util.List;

public class ForumStats {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users = UserRepository.getUserList();
        System.out.println("Average posts for users age >=40: " + calcAvgPostsMoreEqualsAge40(users));
        System.out.println("Average posts for users age < 40: " + calcAvgPostsLessAge40(users));
    }
    public static double calcAvgPostsMoreEqualsAge40(List<User> users){
        double avg = users
                .stream()
                .filter(user -> user.getAge() >= 40)
                .mapToInt(u -> u.getNumberOfPost())
                .average()
                .getAsDouble();
        return avg;
    }

    public static double calcAvgPostsLessAge40(List<User> users){
        double avg = users
                .stream()
                .filter(user -> user.getAge() < 40)
                .mapToInt(u -> u.getNumberOfPost())
                .average()
                .getAsDouble();
        return avg;
    }

}

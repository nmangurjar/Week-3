package singlylinkedlist.socialmediaconnections;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SocialMedia socialMedia = new SocialMedia();

        socialMedia.addUser(101,"naman",21);
        socialMedia.addUser(202,"om",22);
        socialMedia.addUser(303,"ishaan",23);

        socialMedia.findMutualFriends(101,202);
        socialMedia.removeFriendConnection(303,101);
        socialMedia.displayAllUsers();


    }
}
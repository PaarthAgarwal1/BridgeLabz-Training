class FriendNode {
    int friendId;
    FriendNode next;

    FriendNode(int id) {
        this.friendId = id;
        this.next = null;
    }
}


class UserNode {
    int userId;
    String name;
    int age;
    FriendNode friendHead;
    UserNode next;

    UserNode(int id, String name, int age) {
        this.userId = id;
        this.name = name;
        this.age = age;
        this.friendHead = null;
        this.next = null;
    }
}



public class SocialMediaList {
    private UserNode head = null;

    // Add user
    public void addUser(int id, String name, int age) {
        UserNode newUser = new UserNode(id, name, age);
        newUser.next = head;
        head = newUser;
    }

    // Find user by ID
    private UserNode findUserById(int id) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.userId == id)
                return temp;
            temp = temp.next;
        }
        return null;
    }

    // Search user by ID or Name
    public void searchUser(int id, String name) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.userId == id || temp.name.equalsIgnoreCase(name)) {
                System.out.println("User Found: " + temp.userId + ", " + temp.name + ", Age: " + temp.age);
                return;
            }
            temp = temp.next;
        }
        System.out.println("User not found!");
    }

    // Add friend connection (two-way)
    public void addFriend(int id1, int id2) {
        UserNode u1 = findUserById(id1);
        UserNode u2 = findUserById(id2);

        if (u1 == null || u2 == null) {
            System.out.println("User not found!");
            return;
        }

        addFriendNode(u1, id2);
        addFriendNode(u2, id1);

        System.out.println("Friend connection added between " + id1 + " and " + id2);
    }

    private void addFriendNode(UserNode user, int friendId) {
        FriendNode newFriend = new FriendNode(friendId);
        newFriend.next = user.friendHead;
        user.friendHead = newFriend;
    }

    // Remove friend connection
    public void removeFriend(int id1, int id2) {
        UserNode u1 = findUserById(id1);
        UserNode u2 = findUserById(id2);

        if (u1 == null || u2 == null) {
            System.out.println("User not found!");
            return;
        }

        removeFriendNode(u1, id2);
        removeFriendNode(u2, id1);

        System.out.println("Friend connection removed.");
    }

    private void removeFriendNode(UserNode user, int friendId) {
        FriendNode temp = user.friendHead;
        FriendNode prev = null;

        while (temp != null) {
            if (temp.friendId == friendId) {
                if (prev == null)
                    user.friendHead = temp.next;
                else
                    prev.next = temp.next;
                return;
            }
            prev = temp;
            temp = temp.next;
        }
    }

    // Display all friends of a user
    public void displayFriends(int userId) {
        UserNode user = findUserById(userId);
        if (user == null) {
            System.out.println("User not found!");
            return;
        }

        System.out.print("Friends of " + user.name + ": ");
        FriendNode temp = user.friendHead;

        if (temp == null) {
            System.out.println("No friends");
            return;
        }

        while (temp != null) {
            System.out.print(temp.friendId + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Find mutual friends
    public void findMutualFriends(int id1, int id2) {
        UserNode u1 = findUserById(id1);
        UserNode u2 = findUserById(id2);

        if (u1 == null || u2 == null) {
            System.out.println("User not found!");
            return;
        }

        System.out.print("Mutual Friends: ");
        FriendNode f1 = u1.friendHead;
        boolean found = false;

        while (f1 != null) {
            FriendNode f2 = u2.friendHead;
            while (f2 != null) {
                if (f1.friendId == f2.friendId) {
                    System.out.print(f1.friendId + " ");
                    found = true;
                }
                f2 = f2.next;
            }
            f1 = f1.next;
        }

        if (!found)
            System.out.print("None");

        System.out.println();
    }

    // Count number of friends
    public void countFriends() {
        UserNode temp = head;

        while (temp != null) {
            int count = 0;
            FriendNode f = temp.friendHead;
            while (f != null) {
                count++;
                f = f.next;
            }
            System.out.println(temp.name + " has " + count + " friends.");
            temp = temp.next;
        }
    }

    // Main method (Demo)
    public static void main(String[] args) {
        SocialMediaList sm = new SocialMediaList();

        sm.addUser(1, "Aman", 20);
        sm.addUser(2, "Riya", 21);
        sm.addUser(3, "Rahul", 22);

        sm.addFriend(1, 2);
        sm.addFriend(1, 3);
        sm.addFriend(2, 3);

        sm.displayFriends(1);
        sm.findMutualFriends(1, 2);
        sm.searchUser(3, "");
        sm.countFriends();

        sm.removeFriend(1, 3);
        sm.displayFriends(1);
    }
}

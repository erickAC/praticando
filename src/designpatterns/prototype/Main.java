package designpatterns.prototype;

public class Main {
    public static void main(String[] args) {
        var user1 = new User();
        user1.setId(1);
        user1.setNome("Erick");

        var user2 = new User();
        user2.setId(2);
        user2.setNome("Duda");

        var userClone = user1.clone();

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(userClone);
    }
}

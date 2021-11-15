import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Task task1=new Task("name1","decription1","cip1", LocalDateTime.of(2021,11,15,10,20));
        Task task2=new Task("name2","decription2","cip2", LocalDateTime.of(2021,11,15,10,20));
        Task task3=new Task("name3","decription3","cip3", LocalDateTime.of(2021,11,15,10,20));
    System.out.println(task1);
    System.out.println(task2);
    System.out.println(task3);


    }
}

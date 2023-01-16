package Midterm;

public class AuthorDriver {
    public static void main(String[] args) {
        Author Tariq = new Author("TariqAziz", "tariq_aziz_2025.com", 'm');
        System.out.println(Tariq);
        Tariq.setEmail("Tariq.com");
        System.out.println("name is: " + Tariq.getName());
        System.out.println("email is: " + Tariq.getEmail());
        System.out.println("gender is: " + Tariq.getGender());
    }
}

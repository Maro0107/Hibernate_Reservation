package pl.clockworkjava.hotelreservation.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Arrays;
import java.util.List;

public class App {

    private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("thePersistenceUnit");
    private static EntityManager em  = factory.createEntityManager();

    public static void main(String[] args) {
        GuestRepository guestRepository = new GuestRepository(em);
        guestRepository.createNewGuest("Paweł", 34);
//        guestRepository.createNewGuest("Kinga", 37);
//        guestRepository.createNewGuest("Alicja", 6);
//        guestRepository.createNewGuest("Gabriel", 5);

        em.getTransaction().begin();
        em.flush();
        em.clear();
        em.getTransaction().commit(); // wrzucenie wszystkiego z PC do bazy danych i jego wyczyszczenie, by wrócić do "czystego" stanu.

//        Guest ali = guestRepository.findById(3);
//        System.out.println(ali);
//        ali.setAge(7);
//        System.out.println(ali);
//        List select_g_from_guest_g = em.createQuery("SELECT g FROM Guest g").getResultList();
//        System.out.println("--------------------------------");
//        select_g_from_guest_g.forEach(quest -> System.out.println(quest));
    }
}
package za.ac.cput.Group19CarWash.factory;

import za.ac.cput.Group19CarWash.domain.Administrator;

public class AdministratorFactory {

    public static Administrator createAdministrator(Long id, String adminId, String adminFname, String adminSname, String bookingId) {

        Administrator administrator = new Administrator.Builder()
                .setId(id)
                .setAdminId(adminId)
                .setAdminFname(adminFname)
                .setAdminSname(adminSname)
                .setBookingId(bookingId)
                .build();
        return administrator;
    }
}

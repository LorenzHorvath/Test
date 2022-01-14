/*----------------------------------------------------------
 *                HTBLA-Leonding / Class: 3CHIF
 * ---------------------------------------------------------
 * Title: Test
 * Author: Lorenz Horvath
 * ----------------------------------------------------------
 * Description:
 * Implementation of Building
 * ----------------------------------------------------------
 */
package at.htlleonding;

public class Building {
    Integer id;
    String initialResident;
    String[] initialResidents;

    public Building(Integer id, String initialResident) {
        this.id = id;
        this.initialResident = initialResident;
    }

    public Building(Integer id, String[] initialResidents) {
        this.id = id;
        this.initialResidents = initialResidents;
    }

    public Integer getId() {
        return id;
    }

    public String getInitialResident() {
        return initialResident;
    }

    public String[] getInitialResidents() {
        return initialResidents;
    }
}